# Definition
The Observer pattern is a software design pattern in which an object has a list of its observers and notifies them of any changes, usually by calling one of their methods.

## When to use the Observer pattern

* When you need many other objects to receive updates when another object changes
*For example:*
*The Subject sends many stocks to its Observers*
*The Observers choose the ones they want and use them*

## Benefits

* Loose coupling - the Subject does not need to know anything about the Observers
* Negatives: the Subject may send updates that do not matter to the Observer