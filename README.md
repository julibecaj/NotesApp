# NotesApp

NotesApp is an Android application designed to help users take and manage notes efficiently. This project is built using Java and leverages modern Android libraries for UI and functionality.

## Features

- Create and manage notes within the app.
- Voice input for note-taking: Use your microphone to dictate notes, which are then transcribed and stored.
- Modern Android UI with support for edge-to-edge screens and responsive layouts.
- Fragment-based navigation for smooth transitions between features.

## Getting Started

### Prerequisites

- Android Studio (recommended)
- Java 11 or later
- Android SDK 24 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/julibecaj/NotesApp.git
   ```

2. Open the project in Android Studio.

3. Build and run the application on an emulator or physical device.

## Project Structure

- `app/src/main/java/com/example/notesapp/`
  - `MainActivity.java`: Main entry point. Handles navigation and UI.
  - `VoiceInputActivity.java`: Fragment for voice input and transcription.
- `app/src/main/res/layout/`
  - Layout XML files for activities and fragments.
- `app/build.gradle.kts`: App-level Gradle configuration.
- `build.gradle.kts`: Project-level Gradle configuration.

## Usage

- Launch the app on your device.
- Tap the microphone button to start voice input and create new notes.
- The app is designed for a smooth note-taking experience, leveraging Android's latest UI features.

## Testing

- Instrumented tests are located in `app/src/androidTest/java/com/example/notesapp/`.
- Unit tests are located in `app/src/test/java/com/example/notesapp/`.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request. For major changes, open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License.

---

*Built with 💡 by julibecaj*
