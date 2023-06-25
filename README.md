# DropNumberGame

It is to create a Drop Number Game using certain data structures (Multi-Linked List) in the Java programming language, and during the creation of this game, we were asked to create our own Linked List and Node classes in accordance with the project. Some of these operations are the operations of checking these data, which are added by adding data to the right or up in a linked list.
First of all, after setting up the internal design of the project (Drop Number Game) similar to the game in my head, I have watched the past lesson replays, then I put together the information I could learn about the topics of the Linked List and Node data structures and put the progress of this project in an algorithmic order in my head. After this process, I made a note to summarize what I can do in the Linked List and Node classes that I will create in order to help me in the later parts of the project. After doing all these operations, it actually took me only 3 days to fill in the contents of the classes I created and pour the operations of the ‘Drop Number Game’ into the coding section.
The "EmirOzalp_NodeClass" class defines a generic class with a constructor that takes a
generic data type “T” and an integer “numberOfColumn” as parameters. The class also has
several instance variables, including a reference to the next node on the same row (‘next’), a reference to the node above it on the same column (‘upper’), a reference to the node below it on the same column (‘down’), and the number of the column (‘numOfColumn’) that the node
belongs to.
➢ The class has a method ‘getData()’ that returns the generic data type ‘T’ of the node and a
method ‘getColumnNum()’ that returns the number of the column that the node belongs to.
➢ The class also has private method ‘addChildToThisNode’ that takes a
‘EmirOzalp_NodeClass<T>’ object as a parameter and adds it as a child node below the
current node. This method also checks if the child node's data is the same as the parent
node's data, aggregates them, and replaces the child node's data with the total value.
➢ Lastly, the class has a public method ‘addChild’ that takes a ‘EmirOzalp_NodeClass<T>’
object as a parameter and adds it as a child node to the current node. This method first
ascends to the top node and then adds the new child node to the parent node using the
‘addChildToThisNode’ method.

The "EmirOzalp_MultiLinkedListClass" class " which represents a multi-linked list data structure and the class includes several methods to add new nodes to the list and control the structure of
the list.
➢ The "getHead" method returns the head node of the list which is the first node in the linked list.
➢ The "addData" method adds a new node to the list based on the column number of the new
node. If the list is empty, it sets the head of the list as the new node. Otherwise, it checks whether the new node is already in the column or not. If it is not, it adds the new node to the appropriate column based on the column number. If it is already in the column, it wastes the new node to the top of that column.
➢ The “addChild" method adds a new node as a child of a parent node in the linked list based
on the column number of the new node.
➢ The "controlOfRow" method checks whether the node to be entered has previously been
formed in the column at this time or not. If there is an equality in the number of columns, it returns to the boolean value after this element is wasted to the top of that column.
➢ The "sortedAdd" method adds the new node to the appropriate order by navigating the
existing nodes. If the list is empty or the new node's number of column is smaller than the
head node's number of column, it adds the new node to the beginning of the list. Otherwise,
it finds the new node in the appropriate position by navigating the existing nodes and adds it to the appropriate position of the list.
Finally my “EmirOzalp_DropNumberGame” class creates a game called “Drop Number Game”
using Java Swing. The game consists of a 7x5 grid of squares, and each turn, a number drops
into one of the five columns. The player's objective is to merge the numbers in adjacent squares to create higher numbers. The game ends when there are no more spaces for new numbers to drop into.
➢ The program defines a class called "EmirOzalp_DropNumberGame," which extends the
JFrame class. The class contains a MultiLinkedList object and two 2D integer arrays. One of
the 2D arrays is used to store the input data, which is the initial state of the game board.
The other 2D array is used to keep track of the current state of the game board. The
program also defines a getColor method to map the integer values in the 2D array to
columns and the colors.
➢ The class overrides the paint method of the JFrame class to draw the game board on the
screen. The paint method first draws the grid of squares, then draws the current state of the
game board on top of the squares.
➢ The class also defines several helper methods, including isGameOver, which checks
whether the game has ended, and setVisibleFalse, which makes some of the text fields on
the JFrame invisible when the game is over
