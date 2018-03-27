# SpaceX
In this program you can construct you rocket and fly to another planet. The rocket consists of one cabin(Alfa, Beta, Gama, Delta, Zeta), also you can choise number of engines by your rocket between 3 and 5 inclusive. You can choise V8, V7, V6, V5 or V4 engine. To each engine you must choice fuel tank(very large, large, medium, small, very small), but it can not be bigger then engine.
# If you want packed this project on jar file you shoud do next steps:
1. Git clone this project.
2. cd SpaceX and after that cd src.
3. javac Main.java.
4. create file manifest.mf in src dirictory and in this file write next: 
```
Manifest-Version: 1.0
Main-Class: Main
```
5. jar cmf manifest.mf App.jar *.
# Example of run app:
java -jar App.jar
