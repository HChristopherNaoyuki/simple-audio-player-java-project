# SimpleAudioPlayer

A basic Java application that allows users to play, stop, and reset audio files using the Java Sound API. The user interface is console-based, providing a simple menu for audio playback control.

## Features

- Play an audio file
- Stop playback
- Reset playback to the beginning
- Simple console-based user interface

## Requirements

- Java Development Kit (JDK) 8 or higher
- An audio file in WAV format

## Getting Started

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/SimpleAudioPlayer.git
   cd SimpleAudioPlayer
   ```

2. **Set Up Your Audio File**
   - Ensure you have an audio file in WAV format.
   - Update the file path in the `AudioPlayer` class:
     ```java
     File file = new File("E:\\Source Code\\Netbeans\\Audio\\your-audio-file.wav");
     ```

3. **Compile and Run**
   - Compile the Java file:
     ```bash
     javac AudioPlayer.java
     ```
   - Run the application:
     ```bash
     java AudioPlayer
     ```

## Usage

- Upon running the application, a menu will appear:
  ```
  ********************************************
  Press (P) to Play   
  Press (S) to Stop   
  Press (R) to Reset  
  Press (Q) to Quit   
  ********************************************
  Enter your choice: 
  ```
- Input your choice to control the audio playback.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

Feel free to submit issues or pull requests for improvements! 

## Acknowledgments

- Inspired by Java's Sound API documentation.
- Special thanks to the open-source community for their resources and support.
