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

## Conclusions & Recommendations<a name = "con"></a>

## Demo<a name = "demo"></a>

## References<a name = "ref"></a>
