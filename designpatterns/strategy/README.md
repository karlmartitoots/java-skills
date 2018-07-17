# Definition
Define a family of algortihms, encapsulate each one and make them interchangeable. The Strategy pattern allows the algorithm to vary independently from clients who use it.

## When to use the Strategy pattern

* **When defining a class with behavior that is similar to other behaviors in a list**

*For example:*
*I want the class object to be able to choose from*
    * _Not Flying_
    * _Fly with Wings_
    * _Fly Super Fast_

* **When using one of several behaviors dynamically**

## Benefits

* Often reduces long lists of conditionals
* Avoids duplicate code
* Keeps class changes from forcing other class changes (encapsulation)
* Can hide complicated code from the user
* Negative: Increased number of classes