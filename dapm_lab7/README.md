In this lab we learned how to transform an audio input into a text and how to read this text. 

In the app we have two buttons and a text field. 
When "Tap to open mic" button is clicked the function show() in called. The microphone should start and record. The recorded sound should be taken word by word. The spoken text is then put into the text field. 
Because I'm working with the emulator, I defined a string with the value "Microphone not working" and hardcoded it in the text field. I had to it this way because the emulator does not support recording yet. (the microphone shuts down immediately)

When the "Listen it" button is clicked the function speak() is called. If there is something in the text field then the app will say it. If there's nothing in the text field, then the app will show a toast with the text "no input" and will say that "Everything is not working".

The second exercise was a tutorial with fragments in which we learned how to use two different fragments (independent components that can be used in multiple activities) in an app.


The video with the forst app is in this folder, called wx1.mov
