package com.esppablo.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.esppablo.lookify.models.Song;
import com.esppablo.lookify.repositories.AppRepository;

@Service
public class AppService {
	private AppRepository appRepository;
	
	public AppService(AppRepository appRepository) {
		this.appRepository = appRepository;
	}
	
	// return all songs
	public List<Song> allSongs(){
		return appRepository.findAll();
	}
	
    // add new song
    public void addSong(Song song) {
    	appRepository.save(song);
    }	
    
	// return song
	public Song findSongById(Long id) {
        Optional<Song> optionalSong = appRepository.findById(id);
        if(optionalSong.isPresent()) {
            return optionalSong.get();
        } else {
            return null;
        }	
	}
	    
    // delete song
    public void destroySong(Long id) {
		appRepository.deleteById(id);
    }
    
    // search artist
    public List<Song> findByArtist(String artist) {
    	return appRepository.findByArtistContaining(artist);
    }
    
    // top ten songs
    public List<Song> findTopTen(){
    	return appRepository.findTop10ByOrderByRatingDesc();
    }
    
}
 