# BirdSoundRecognizeAPP

I also researched it for a long time, because there is no material on the Internet that teaches how to convert the audio data into the same method as the input structure of the model, especially when the image is real-time.

On the Android Studio platform, Mel-Scaled Log-Magnitude Spectrograms can be quickly obtained through the Jlibrosa library. The relevant parameters are also the same as the feature extraction process in the training phase.

I finally finished it and put it up for your reference.

Please let me know if there is something wrong, thank you.

Keyword: Bird Sound、Bird Sound Recognition、Application、Machine Leanring、Bird Identification

# Introduce

Three CNN models for bird sound recognition are trained and tested with different configurations and hyperparameters. Models can be used offline. Unlike traditional methods, our method does not need to send data back to the server, thus saving at least 8 seconds for the overall computation time.

The model trained in the previous step will be deployed to the mobile phone for use.

The ResNet version is currently available.
I have not uploaded the method for Efficientnet and YAMNet.

The flow chart of the ResNet model running on a smartphone in real time is as follows:
![alt text](image/resnet-flow%20chart.png "resnet-flow chart")

After recording, one second of audio is processed and then identified.

# Future Features

I will provide a more complete interface, and will add a "statistical results within 10 seconds" function

Or you can change the number of seconds, not limited to 1 second, but I haven't written it yet
