
Mobile-Automate  with "General Store" APK using Java. This project demonstrates the automation of various popular online book retailer features, including scrolling, mouse hover actions, menu selection, text filtering, book overviews, shopping cart interactions, and more.
# 🚀 Mobile Automation with Appium

## Overview

This project showcases the power of mobile automation using Appium for an Android application - the General Store app. The automation script seamlessly adds a product to the cart, making your testing process a breeze.

## 🛠 Prerequisites

Before diving into the automation magic, make sure you have the following tools installed:

- **Java Development Kit (JDK)**
- **Appium**
- **Android Emulator or Physical Android Device**
- **General Store App APK File**

## 🚀 Setup Instructions

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Tashfiquzzaman/Mobile_Automation.git
   ```
1. Install Dependencies:
```bash
cd Mobile_Automation
```
2. Download the General Store APK:
 https://github.com/Tashfiquzzaman/Mobile-Automation-Project-with-APK.git
3. Update Appium Capabilities:

4. Update appPackage and appActivity in Product_Addto_Cart.java with your app's details.
5. Run the Appium Server:
````bash
appium
````
6. Execute the Test Script:
```bash
mvn test
```
📂 Project Structure
src/test/java/com/it/Mobile_Automation/Product_Addto_Cart.java: Main test script.
src/test/resources: Resources like the General Store APK.

🌟 Test Steps

1. Launch the General Store app.

2. Enter a name and select the gender.

3. Click "Let's Shop" to explore products.

4. Add the first product to the cart.
   
5. View your cart to ensure the magic works.

📦 Dependencies

TestNG

Appium Java Client



