
    Initial State:              Solution State:
    --------------------        --------------------
    | 1 | S | 1 | 1 | 1 |       | 2 | S | 1 | 1 | 1 |
    --------------------        --------------------
    | 1 | 0 | 0 | 0 | 0 |       | 2 | 0 | 0 | 0 | 0 |
    --------------------        --------------------
    | 1 | 1 | 1 | 1 | 1 |       | 2 | 2 | 2 | 2 | 2 |
    --------------------        --------------------
    | 0 | 1 | 0 | 0 | E |       | 0 | 1 | 0 | 0 | E |
    --------------------        --------------------
    | 1 | 1 | 1 | 0 | 1 |       | 1 | 1 | 1 | 0 | 1 |
    --------------------        --------------------

This is a maze game using a recursion algorithm.

The txt files are the maps 
First line is row x col number
Inside the map, S means where you start, E means the finish point.
1's are the roads and 0's are the walls.

This algoritm will find the shortest route to reach E (finish point).
It will print out a solution map with 2's as the shortest way to E.


maze4.txt have no solution.


to run, type "java mazev2 maze1.txt"

THIS VERSION IS CORRECT, DO NOT CHANGE
