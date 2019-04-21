---------------------
CSCI 468 - Compilers
Spring 2019
Step 04 - Grading Script
---------------------

The grading script given is the one that will be used to grade your project step 04 submissions. Use the esus machines (in BARH 254) to run the script and check your code (in Linux).

Following are the instructions for running your code using the grading script in order for it to meet with the grading requirements of the project. 

Follow all the instructions and make sure your code gives the expected output. This process will makesure if your code meets the requirements asked in the project instructions. 

01. Make sure your Micro script and the grading script are executables. Use the following command to make them executables.
	chmod +x <file_name>
	
02. Specify the location of the input testcases in line 03 and output testcases in line 14 (the testcases provided in D2L). 

03. Change the file name in line 11 to the name of your Micro script. 

04. Run the grading script. 
	./Grading_Script_Step4.sh
	
05. Results for your outputs and the given outputs will be printed in two columns (column 1 will be your output). You can check if the output values for each testcase are what is expected by comparing the columns (ecxept for the statistics). 
