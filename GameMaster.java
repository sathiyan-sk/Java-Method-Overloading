   // Method to describe a character
public class GameMaster {
    // Assume the Character interface is defined as:
    
    // TODO: define a 'describe' method that returns a description of a Character
 public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
 }
     
    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }
    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod travelMethod) {
        return "You're traveling to your destination " + (travelMethod == TravelMethod.WALKING ? "by walking." : "on horseback.");
    }
    
    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }
    // TODO: define a 'describe' method that returns a description of a Character and Destination
public String describe(Character character, Destination destination) {
        return describe(character, destination, TravelMethod.WALKING);
    }
}
