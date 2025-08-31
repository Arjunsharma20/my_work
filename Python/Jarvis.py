import speech_recognition as sr
import webbrowser
import pyttsx3

# recognition = sr.Recognizer() #help to recognitio our voice
engine = pyttsx3.init() # initialise pyttsx
def speak(text):
    engine.say(text)
    engine.runAndWait()
if __name__ == "__main__":
    speak("Hey Arjun Sharma")
    speak("How are you")
    # listen for the wake word "Jarvis"
