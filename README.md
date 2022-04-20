# ISB10103 - Principles of Computer Programming

## Scenario 7

### Table of Contents

1.  [Question](#question)
    1.  [Task 1](#task-1)
    2.  [Task 2](#task-2)
    3.  [Task 3](#task-3)
    4.  [Task 4](#task-4)
2.  [Discussion](#discussion)
    1.  [Task 1](#task-1-1)
    2.  [Task 2](#task-2-1)
    3.  [Task 3](#task-3-1)
    4.  [Task 4](#task-4-1)
3.  [Answer](#answer)

### Question

You as a junior programmer at Beauty Salon. Your task is to produce a Sale System for the new outlet in Gombak. Your system should be able to display as following screen.

![](/assets/images/01.png)

You are required to write a program to perform the following tasks:

#### Task 1

Declare an appropriate arrays and store the above information.

#### Task 2

Display the information as the above format.

#### Task 3

Calculate the total Price of all products sold and display it as the following format:

![](/assets/images/02.png)

#### Task 4

Sort the array in ascending/descending order for Price (Set B).

---

### Discussion

#### Task 1

Initialize all arrays with proper types as follows:

| Variables  | Data Types |
| ---------- | ---------- |
| codes      | String[ ]  |
| products   | String[ ]  |
| pricesSetA | double[ ]  |
| pricesSetB | double[ ]  |

For example:

```Java
String[] codes = {"BS01", "BS02", "BS03", "BS04"};
```

#### Task 2

Print the header using `System.out.println()` line by line. For example:

```Java
System.out.println("Beauty Salon");
System.out.println("   Gombak   ");
```

Then, print the rest of information inside loop using `System.out.format()` with proper formatting which can be referred [here](https://www.baeldung.com/java-printstream-printf). For example:

```Java
for (int i = 0; i < arr.length; i++) {

    System.out.format("%-5s %-10s %-5.2f", arr1[i], arr2[i], arr3[i]);
}
```

The indent number will be calculated manually.

#### Task 3

Initialize two variables to store the total price for Price (Set A) and Price (Set B) each as zero. Use array loop to add each price to the total. For Example:

```Java
double total = 0.0;

for (double num : nums) {

    total += num;
}
```

Print the total with mentioned format using `System.out.format()`.

#### Task 4

Sort Price (Set B) in ascending order using `Arrays.sort()`. For example:

```Java
Arrays.sort(arr);
```

Reverse the array with loop to make it appear in descending order. How to:

```
*LS = Left Side
*RS = Right Side

1st loop:

1   2   3   4   5   6   7   8
│                           │
└─────────────┬─────────────┘
              │
    Swap LS, 1 with RS, 8

2nd loop:

8   2   3   4   5   6   7   1
    │                   │
    └─────────┬─────────┘
              │
    Swap LS, 2 with RS, 7

...

(n/2)th loop, where n is the length of array:

8   7   6   4   5   3   2   1
            │   │
            └─┬─┘
              │
    Swap LS, 4 with RS, 5

Result:

8   7   6   5   4   3   2   1
```

Swap, how to:

```

  1. Store RS value in tmp    3. Put old RS value into LS via tmp
  ┌─────────────────────> tmp ─────────────────────┐
  │                                                ↓
arr[0] arr[1] arr[2] arr[3] arr[4] arr[5] arr[6] arr[7]
  8      2      3      4      5      6      7      1
  ↑                                                │
  └────────────────────────────────────────────────┘
  2. Put LS value into RS
```

For Example:

```Java
for (int i = 0; i < arr.length / 2; i++) {

    double tmp = arr[i];
    arr[i] = arr[arr.length - 1 - i];
    arr[arr.length - 1 - i] = tmp;
}
```

---

### Answer

The code can be found as follows:

- [GitHub](src/Main.java)
- [GitHub Raw](https://raw.githubusercontent.com/mahran01/ISB10103-Assignment/main/src/Main.java)
- [JDoodle](http://jdoodle.com/ia/pRx)

The ouptput of the code is as follows:

```
                          Beauty Salon
                             Gombak
----------------------------------------------------------------
Code  Products           Price (Set A)  Price (Set B)
----------------------------------------------------------------
BS01  Lipstick           200.00         250.00
BS02  Compact Powder     200.00         400.00
BS03  UV Sun Protection  300.00         500.00
BS04  Lotion             100.00         350.00

Total Price (Set A): RM 800.00
Total Price (Set B): RM 1500.00
```
