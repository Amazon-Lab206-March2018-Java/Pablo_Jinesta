package com.esppablo.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.esppablo.lookify.models.Song;
import com.esppablo.lookify.services.AppService;

// Create an app for manipulating playlists

@Controller

public class AppController {

	private final AppService appService;
	public AppController(AppService appService) {
		this.appService = appService;
	}
	
	@RequestMapping("/")
	public String index() { 
		return "index";
	}
	
	// Have a dashboard that shows all the songs
	@RequestMapping("/dashboard")
	public String dashboard(Model model, @ModelAttribute("song") Song song) { 
		List<Song> songs = appService.allSongs();
		model.addAttribute("songs", songs);
		return "dashboard";
	}
	
	@RequestMapping("/songs/{id}")
	public String findSongByIndex(Model model, @PathVariable("id") Long id) {
		model.addAttribute("song", appService.findSongById(id));
		return "song";
	}
	
	// Be able to add new songs on a separate page
    @RequestMapping("/songs/add_new")
    public String newSong(@ModelAttribute("song") Song song) {
        return "add_new";
    }

    @PostMapping("/songs/add_new")
    public String createSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
        if (result.hasErrors()) {
            return "add_new"; 
        } else {
            // Add the song
        	appService.addSong(song);
            return "redirect:/dashboard" ;
        }
    }	
    
    // Be able to delete songs from the dashbaord
    @RequestMapping("/delete/{id}")
    public String destroySong(@PathVariable("id") Long id) {
        appService.destroySong(id);
        return "redirect:/dashboard";
    }
    
    // Be able to search by artist name for songs
	@RequestMapping("/search")
	public String searchArtist(@RequestParam("artist") String artist) {
		return "redirect:/search/" + artist;
	}
	
    @RequestMapping("/search/{artist}")
    public String findArtist(@ModelAttribute("artist") String artist, Model model) {
    	model.addAttribute("songs", appService.findByArtist(artist));
    	return "results";			
    }
    
    // See top ten songs in database
    @RequestMapping("/search/topTen")
    public String topTen(Model model) {
    	model.addAttribute("songs", appService.findTopTen());
    	return "topTen";
    }
}
