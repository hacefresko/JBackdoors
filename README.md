# JRAT

Set of fake Java applications with hidden backdoors made to learn about socket programming and backdoors.

Each application triggers a reverse shell when executed, opening a PowerShell session. It also allows transfering files in both directions (use help command for more info). It only supports one connection at a time.

None of the applications is blocked by WindowsDefender

<img src="https://raw.githubusercontent.com/hacefresko/JRAT/master/git%20resources/console.jpg" width="500px">

## Applications

* RAW: Just the backdoor, without any masking application
* CSGOHacks: Fake application to gain cheats for the game "Counter Strike: Global Offensive"
* KeyGen: Fake key generator for some programs from the Adobe Suite
* YoutubeMP3: Fake YouTube to mp3 converter


<img src="https://raw.githubusercontent.com/hacefresko/JRAT/master/git%20resources/csgo.png" width="400px">
<img src="https://raw.githubusercontent.com/hacefresko/JRAT/master/git%20resources/keyGen.png" width="400px">
<img src="https://raw.githubusercontent.com/hacefresko/JRAT/master/git%20resources/youtubeMP3.png" width="400px">

## Usage

* The attacker must run the Attacker project launched from launcher/main.java. It will create a server listening by default on port 5123 (this can be easily changed in main.java).
* The application for the victim must be configured by specifying the attacker's IP and port. Then, it must be packed into a .jar file. I recommend using any application to convert the .jar to .exe such as Launch4j, although the vicitm still needs to have Java installed. When the victim executes the application, it will connect to the attacker's machine and will open the PowerShell session.

## Disclaimer

This tool was written for learning purposes. Its usage against infrastructures without the consent of the owner can be considered as an illegal activity. Authors assume no liability and are not responsible for any misuse or damage caused by this program.
