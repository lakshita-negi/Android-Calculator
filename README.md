# Android Calculator App

A simple Android Calculator application developed using **Java and XML in Android Studio**.
The application includes a **Splash Screen** and a **basic arithmetic calculator interface** with a clean user interface.

---

## Features

* Splash Screen displayed when the app launches
* Simple and user-friendly calculator UI
* Performs basic arithmetic operations:

  * Addition (+)
  * Subtraction (-)
  * Multiplication (×)
  * Division (÷)
  * Percentage (%)
* Clear (C) button to remove the last entered value
* All Clear (AC) button to reset input and output
* Dynamic input display
* Real-time calculation using JavaScript engine (Rhino)

---

## Technologies Used

* **Java**
* **Android Studio**
* **XML Layout Design**
* **Rhino JavaScript Engine** for expression evaluation
* **Edge-to-Edge UI support**

---

## Application Structure

### SplashScreen Activity

Displays a splash screen when the app starts and automatically navigates to the calculator screen after 1 second.

**Key Concepts Used:**

* Handler for delay
* Intent for activity navigation
* EdgeToEdge layout support

---

### MainActivity (Calculator Logic)

Handles the main calculator functionality including:

* Input display
* Output result
* Button click events
* Arithmetic expression evaluation

The calculator evaluates mathematical expressions using the **Rhino JavaScript engine**.

Example:

```
7 + 5 * 2
```

The expression is evaluated dynamically and the result is displayed in the output TextView.

---

### Clear Button (C)

Removes the last character from the input.

---

### All Clear Button (AC)

Resets both input and output fields.

---

## User Interface

The UI is designed using **XML layouts** with:

* Two TextViews

  * Input display
  * Output result
* Multiple buttons for numbers and operations
* Clean layout using LinearLayouts

---

## How to Run

1. Open the project in **Android Studio**
2. Sync Gradle files
3. Connect an Android device or emulator
4. Run the application

---

## Learning Outcomes

This project demonstrates:

* Android Activity lifecycle
* Event handling in Android
* Working with Buttons and TextViews
* Using external libraries (Rhino)
* Creating a splash screen
* Expression evaluation logic
---
[Splash Scren](https://github.com/user-attachments/assets/7b77383b-b19b-44cb-9546-ac92f941f29d)
[Main Screen](https://github.com/user-attachments/assets/7cd0b79d-e5e0-4f99-be28-953eda25f5c2)
