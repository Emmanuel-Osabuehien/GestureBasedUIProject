# Gesture Based URI Development Project
***

* [Project Details](#details)
* [Overview](#overview)
* [Deployment](#deploy)
* [Software Requirements](#req)
* [Purpose Of The Application](#purpose)
* [Gestures Identified As Appropriate For This Application](#idges)
* [Hardware Used In Creating The Application](#hardware)
* [Architecture For The Solution](#arch)
* [Demo](#demo)
* [Conclusion](#con)
* [References](#ref)

## Project Details<a name = "details"></a>

| Details   |     |
| --- | --- |
| **College** | Galway-Mayo Institute of Technology|
| **Course** | BSc (Hons) in Computing in Software Development  |
| **Module** |  Gesture Based URI Development |
| **Students** | Emmanuel Osabuehien (G00373559), Babajide Olawoye (G00364865)|

## Overview<a name = "overview"></a>

For this project, we had to develop an application with a Natural User Interface where we are given creative freedom to choose whatever programming language and technology we wish to use to create our application. This project must be a gesture controlled application in which we were given the option of using either the Myo Armband or the Leap Motion Sensor as our form of technology.

The concept our my game is to recreate my very own version of old arcade game 'Space Invaders' using the programming language 'Java'.

I decided to go with the Myo Armband as it's use of pre-determined gestures coincided greatly with the concept of my application. "Rather than using special cameras that sense motion and depth, startup Thalmic Labs' Myo armband detects a wearer's movements and translates them into computer controls. After slipping the Myo armband on your forearm, its sensors begin reading electrical activity in your muscles".

This application also incorporates the use of voice commands which I also learned in the duration of this course, the user can control when the game starts, when the game can be paused and resumed, and when the game is reset just by the sound of their voice. The actions of our player can be controlled manually using the keyboard or by using the Myo Armband.

## Deployment<a name = "deploy"></a>

## Software Requirements<a name = "req"></a>

## Purpose Of The Application<a name = "purpose"></a>

<h5>What Is The Game</h5>

![gestures](https://user-images.githubusercontent.com/48318649/166834026-4394c098-a2cc-42f1-9e08-7691033895ca.jpg)

The purpose of this game is to learn, understand, explain and implement the use of voice commands and gesture control with various technology, for the voice commands we will be using microphones and for the gesture control we will be using Myo Armband. For my application, I decided to recreate the classic arcade game 'Space Invaders' with the programming language Java, to create our we used an integrated development environment (IDE) known as 'Eclipse'. The Game uses gesture control to control the movement (moving left and right) and actions (shooting bullets) of the player and uses voice commands to control actions of the game where you can start, pause, resume and reset the game.

<h5>Design Of The Game</h5>

![gamescreen](https://user-images.githubusercontent.com/48318649/166834187-d46878e0-9cec-4f3b-8c10-66d3e5123485.png)

<h5>How To Run Application</h5>

For our application, we have a Myo Script using the programming language Lua where have a function that connects the gesture controls to our application where if it locates the title of the applicatin 'GUI Project' it will return true, the code is as follows:

```lua
function onForegroundWindowChange(app, title)
    if title == "GUI Project" then
        reference = getRoll()
        return true
    end 
end
```

<h5>Voice Commands</h5>

When implementing voice commands, I used various jar files that I researched and found online to complete the use of voice controls, the main jar files known as 'Voce' that can be used by both Java and C++.

```lua
public <String> = [start | reset | stop | continue ];
```

We set up an array of strings which contain the four voice commands that our game will use which include:

- Start: To start the game
- item Stop: To pause the game
- item Continue: To resume the game when paused
- item Reset: To reset the game from the beginning

## Gestures Identified As Appropriate For This Application<a name = "idges"></a>

<h5>Various Gestures Identified By Myo</h5>

Unfortunately my the partner that I originally was working on this project with, decided to sadly leave this course meaning I had full control and freedom to decide how I would incorporate gestures into my application.

I was given two different options for hardware when using gesture control, using either the Myo Armband or the Leap Motion Sensor, I researched both pieces of hardware and after completing my research I decided to use the Myo Armband due to it's pre-built gestures which I decided would work great with my concept of the application, the Myo Armband has seven pre-built gestures which include:

- Wave Left
- Wave Right
- Rotate
- Spread Fingers
- Double Tap
- Make Fist
- Direction/Pan - Up/Down

When implementing the gestures into my application, we initially used the spread fingers gesture to control the shooting of the player and the wave left and wave right to control the movement of the player but as we progressed in the development of the project we decided to change this due to different reasons.

After using the wave left and wave right gesture to control the movement, this became strenuous to continually have to wave your arms in both directions so we decided to use the rotate gesture instead as it didn't exhaust the user to rotate your hand clockwise and anti-clockwise to move the player from right to left and from left to right.

After using the spread fingers gesture to control the shooting of the player, this gesture was not quick to react which meant I had to switch to something else, so I decided to go with the make fist gesture as it reacted on time and was much more precise.

## Hardware Used In Creating The Application<a name = "hardware"></a>

<h5>Myo Armband</h5>

When using gesture control, we decided to use the Myo Armband. "The Myo armband is a gesture controller that triggers a variety of actions on the computer based on the contractions of your muscles and the movements of your arm".

![myoarmband2](https://user-images.githubusercontent.com/48318649/166835268-a8796d90-cfba-4a87-98b1-5028ca931cfa.jpg)

To use the Myo Armband, you will need to download and install the Myo SDK and Connector, this is available for Windows, Mac, Linux and Android.

<h5>Microphone</h5>

We also used voice commands for the application, using a pre-built computer microphone. Voice recognition software lets you dictate documents, search the web, e-mail, and more on your computer quickly and accurately just by using your voice.

## Architecture For The Solution<a name = "arch"></a>

<h5>Java</h5>

I used Java as my programming language to recreate the famous arcade game 'Space Invaders'. I separated the Java classes into different packages, we have packages fileld will classes to control the Enemies, to control the Blocks, to control the Scoreboard, to control the Bullets, to control the Sounds and to control our Player. You will see down below the structure of the Java files:

![javastructure](https://user-images.githubusercontent.com/48318649/166836394-e6821b1a-4235-46fb-ba64-e75a4e9d2d75.png)

<h5>Lua</h5>

I used Lua as my programming language to connect Myo Armband to the application, we also used to this to map the gestures to the keyboard. Here are some exmaples of Lua being used in our application:

```lua
function moveRight()
	myo.keyboard("right_arrow","down")
    rHold = true
end

function fire()
	myo.keyboard("space","down")
    myo.vibrate("short")
end
```

Above we can see an example of mapping the gesture to the keyboard to move right and to shoot, so when the user rotates the armband right/press the right arrow key then the player should move right or when the user makes a fist/presses spacebar then the player should shoot.

<h5>External Jar Files</h5>

We used external jar files for various functions for our app, for example we used the jar file 'Voce' to add voice recognition to our app. Here we have the various libraries that were used to create this application.

![jarfiles](https://user-images.githubusercontent.com/48318649/166836118-5552666b-4186-4b6e-adce-c51ecbb59d26.png)

<h5>Voice Commands</h5>

Using the External Jar Library knownn as 'Voce', I have been able to add voice commands to my app, I use these commands to start, pause, resume and reset the current game once it has been run.

```lua
	public void speech() {

		System.out.println("Say Start!");

		boolean start = false;
		while (!start) {
			// Normally, applications would do application-specific things
			// here. For this sample, we'll just sleep for a little bit.
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
			while (voce.SpeechInterface.getRecognizerQueueSize() > 0) {
				String s = voce.SpeechInterface.popRecognizedString();

				// check if s is equal to start
				if (s.contentEquals("start")) {
					// if it is then end the loop
					// start = true;
					// start the game
					startGame = true;
				} else if (s.contentEquals("stop")) {
					paused = true;
				} else if (s.contentEquals("continue")) {
					paused = false;
				} else if (s.contentEquals("reset")) {
					startAgain = true;
				} else {
					s = "empty";
				}
				System.out.println("You said: " + s);
			}

		}

		voce.SpeechInterface.destroy();

	}
```

## Conclusions & Recommendations<a name = "con"></a>

I am thoroughly impressed with the outcome of my application, we had some bumps in the road with the development but it all came together in the end and we completed our goal in developing a Natural User Interface that incorporates the use of gesture control. The purpose of my app was to recreate a personal version famous arcade game for others to have fun with and I personally believe I have completed that task.

Now I know what you're wondering, were there any issues or challenges, just like in the development of completing any software product there is always gonna be some issue, error, fault or challenge to overcome, here are some issues that I face along the way:

- Research was difficult as there was a very limited amount of content I can find that helped me achieve what I was aiming for
- There were issues with the Myo Armband itself, it was at times difficult for the gestures to be recognized and the Armband at times was difficult to connect and disconnect.
- Learning gesture control for the first time became a challenge trying to get all the technology working together.
- My partner chose to leave this course during the development of the project which was a real challenge in conjunction with the struggle to figure out what the idea for the application was going to be.
- At one point during the development, all my java classes strangely had errors that were difficult to understand what the issue was, I then had to start from scratch and had to redo all my work that I had up to that point.

In conclusion, the overall experience with this project has been a rather pleasant, entertaining and quite intuitive, I have gained so much knowledge in regards to gesture control and voice recognition throughout this whole course, whether it's how they work, how it was invented or how it has progressed throughout history as opposed to before this project where I had little to no knowledge of gesture control technology. In today's world, while Myo might be considered not the best or outdated software, I believe it is a great piece of software in the use of projects such as my own to gain an understanding on this type of technology, a lot of time and effort was put into this project and in the end the outcome was favorable and to my satisfaction.

## Demo<a name = "demo"></a>

## References<a name = "ref"></a>
