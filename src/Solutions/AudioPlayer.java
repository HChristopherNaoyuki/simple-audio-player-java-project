package Solutions;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.*;

public class AudioPlayer
{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        // Create a Scanner object to get user input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Define the file path to the audio file
        // Make sure this path is correct for your environment
        File file = new File("E:\\Source Code\\Netbeans\\Audio\\dizzy-133856.wav");
        
        // Create an AudioInputStream from the file
        // This stream allows us to read the audio data from the file
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        
        // Get a Clip instance from the AudioSystem
        // A Clip is an audio data line that can be used to play back audio
        Clip clip = AudioSystem.getClip();
        
        // Open the clip with the audio stream data
        // This prepares the clip to be played
        clip.open(audioStream);
        
        // Initialize a variable to store the user's response
        String response = "";
        
        // Loop until the user chooses to quit
        while (!response.equals("Q"))
        {
            // Display the menu options to the user
            System.out.println("********************************************");
            System.out.println("Press (P) to Play   ");
            System.out.println("Press (S) to Stop   ");
            System.out.println("Press (R) to Reset  ");
            System.out.println("Press (Q) to Quit   ");
            System.out.println("********************************************");
            System.out.print("Enter your choice: ");
            
            // Read the user's response and convert it to uppercase
            response = scanner.next();
            response = response.toUpperCase();
            
            // Execute different actions based on the user's choice
            switch (response)
            {
                case ("P"):
                    // Start playing the audio clip
                    clip.start();
                    break;
                    
                case ("S"):
                    // Stop the audio clip
                    clip.stop();
                    break;
                    
                case ("R"):
                    // Reset the audio clip to the beginning
                    clip.setMicrosecondPosition(0);     
                    break;
                    
                case ("Q"):
                    // Close the clip to release resources
                    clip.close();     
                    break;
                    
                default:
                    // Handle invalid responses
                    System.out.println("INVALID RESPONSE");
            }
        }
        
        // Display a goodbye message when quitting
        System.out.println("********************************************");
        System.out.println("GOODBYE!");
        System.out.println("********************************************");
    }
}
