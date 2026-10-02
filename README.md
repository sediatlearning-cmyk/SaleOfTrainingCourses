# Sale of Training course

## Table of Contents
1. [General Info](#general-info)
2. [Technologies](#technologies)
3. [Installation](#installation)

### General Info
***
An application for selling in-person or remote training courses, featuring keyword search capabilities and the option for logged-in users to order one or more courses for one or more clients.
Write down the general informations of your project. It is worth to always put a project status in the Readme file. This is where you can add it. 

### Technologies
***
A list of technologies used within the project:
* [Java 1.8]: Version 1.8 
* [Driver mariadb]: Version 2.3.0
* [winp]: winp.zip, which you can use in the project
* [winp]: SQL mariadb version 11.7.1, Nginx version 1.29.6, php version 8.4.19 and phpmyadmin version 5.2.3
  
### Setup

```
You must clone this project

$ git clone https://github.com/sediatlearning-cmyk/SaleOfTrainingCourses.git

Next, use phpMyAdmin to access the database; to do this, you will need:
 - Run winp.exe after unzipping the folder into the project's Winp directory;
 - Install winp at the root of the drive, as it is a portable version.
 - Replace the existing config.inc.php file with the one provided in the winp folder to enable connection to the phpMyAdmin database using the provided credentials.
 - To replace the winp config.inc.php file with the one located in the Winp folder, navigate to the following path: winp -> Install -> phpmyadmin-5.2.3, and paste the file there.

```
### Utilization

First, you need to start the database:
Using WinP, click the "Start Services" button; once all WinP programs show as "ready," the database is ready to run.

Next, launch the program in Eclipse, as this project does not currently have a graphical interface and runs in console mode.
