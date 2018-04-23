// IF
// Let's say we are a basketball player. If a defender is guarding us closely, then we should pass. 
// Our thought process can be represented this way in code.

boolean defenderGuarding = true;
if(defenderGuarding == true) {
    System.out.println("Pass The Ball");
}

// IF-ELSE
// We want to pass the ball if the defender is guarding us but what do we do if the defender isn't guarding us? 
// If the condition is not true, we should write a block of code that will execute so that we will always have something to do 
// whether the defender is guarding us or not.

boolean defenderGuarding = true;
if(defenderGuarding == true) {
    System.out.println("Pass The Ball");
} else {
    System.out.println("Shoot The Ball");
}

// IF-ELSE IF-ELSE
// We shouldn't always shoot the ball if the defender isn't guarding us. 
// What if we are far away from the basket? In that case, instead of shooting the ball we should dribble the ball. 
// In this case, we have three different blocks of code that we can take given a certain set of conditions. 
// We can chain if-else if-else statements to cover all of the different scenarios. 

boolean defenderGuarding = true;
boolean closeToBasket = true;
if(defenderGuarding == true) {
    System.out.println("Pass The Ball");
} else if(closeToBasket == true) {
    System.out.println("Shoot The Ball");
} else {
    System.out.println("Dribble The Ball");
}
