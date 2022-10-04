# Contributor's Guide

Feedback, bug reports, and pull requests are welcome. <br>
Feel free to ask for [help](https://github.com/aryan-upa/SpecialNumberPrograms/issues). 

Working on your first Pull Request? Refer [First Contribution Guide](https://github.com/firstcontributions/first-contributions/blob/master/README.md).

1. Fork this repository.
2. Clone your new repository to your system.
3. Add your program(s). If language not initiated in repo yet, then create a new folder for that language.
4. Please follow the naming conventions as per names of earlier Programs.
5. Commit changes and push. <br>
**Note : Follow Commit message format else pull request will be rejected** <br>
Commit Message Format : <br>
    ```
    feat : Added implementation of __ Program in __ language ❤.
    ```
    Note : *Commit only 1 implementation at a time.*
6. Open and submit a PR. 🎉🎉

## Code Standard

While writing a code
* Follow the coding standards of the language.
* Do not write the main function.
* Just write code for a function which returns whether the number is _special or not.
* _**Only if**_ the language requires to build a class, make it by the same name as of number.
* For example, see the implementation of ArmstrongNumber below.

```java
# Java 
public class ArmstrongNumber {

    public static boolean isArmstrongNumber(long num) {
        if (num < 0)
            return false;
        .
        .
        .

        return sum == num;
    }

}
```

## Considerations

* If it is some special algorithm to work on a number, then comment the name of that algorithm on top of your program.
* While adding another type of number, note that the number should **not be very complex** from an Interview POV.
* While adding another implementation language, create the folder and **update the readMe** as well.
* While adding another implementation of already present number, then its Time Complexity must be better \[provide comparison in the PR\].
* Not maintaining Community Standards anywhere will lead to a ban.
