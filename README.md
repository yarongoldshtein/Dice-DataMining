# Dice-DataMining
Perform data analysis on cube dips, and roulette rotations to test their fairness and to derive information from files that represent a large number of cube casts or roulette rounds.
You can create the above files, and you can also load pre-prepared files.
Provides logins detailing the running process.
In order to calculate whether the cube is fair, we used the calculation of expected value. The expected value represent the value to which the average result of an experiment aspires when the number of experiments strives to infinity. In our case, the expected value of a fair cube is 3.5, and the expected value of a decent (European) roulette is 18. In order to determine whether the cube is fair, the program calculated the expected value for the results obtained, and verified that the result was equal to the fair value to the extent of the approximation error.
When the program runs, a log is generated describing the program results for future use.
To view the log file, go to the folder where the executable file is located, and open
Dice Results.txt / Roulette Results.txt
The file contains the history of the actions performed in the program, as well as the distribution of the results of the cube and roulette.
