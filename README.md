# EarningsTracker3

EarningsTracker3 is a Kotlin Multiplatform (KMP) application designed to help users track their earnings, expenses, and related job details, likely for freelance or service-based work, potentially in fields like insurance adjustment or field services. The application targets both Android and iOS platforms, sharing common business logic and data handling through a shared Kotlin module.

## Key Features (Inferred from Project Structure)

* **Earnings Tracking**: Log services performed, including names, prices, and quantities.
* **Add-on Management**: Attach predefined add-ons to services with associated costs.
* **Expense Logging**: Keep a record of expenses with dates, names, and amounts.
* **Daily Summaries**: Record daily information such as start/end mileage and general notes.
* **Predefined Services**: Utilizes a master list of predefined services and their base prices to streamline entry.
* **Carrier-Specific Information**: Contains data related to various carriers and the services they cover, potentially for billing or service validation.
* **Tarping Calculations**: Includes logic for tarping calculations, resulting in area and user earnings.
* **Cross-Platform**:
    * **Android**: Native Android application.
    * **iOS**: Native iOS application.

## Project Structure

The project is organized into two main modules:

* **:app**: Contains the Android-specific UI (likely Jetpack Compose) and the iOS application code (SwiftUI).
* **:shared**: The Kotlin Multiplatform module. This is where the common business logic, data models, repositories, platform-independent code, and database interactions (using SQLDelight) reside. It provides the core functionality to both the Android and iOS applications.

## Technologies Used

* **Kotlin Multiplatform**: For sharing code between Android and iOS.
* **Kotlin Coroutines**: For asynchronous programming.
* **SQLDelight**: For local database storage, providing type-safe SQL queries.
* **Jetpack Compose**: For the Android UI.
* **SwiftUI**: For the iOS UI.
* **Gradle**: For build automation.

## Building and Running

This is a Gradle-based project.

1.  **Clone the repository.**
2.  **Ensure you have the necessary environment setup:**
    * Android Studio (latest stable version recommended).
    * Xcode (for building and running the iOS app).
    * Java Development Kit (JDK), typically version 11 or higher for modern Android development.
    * Kotlin Multiplatform Mobile plugin in Android Studio.
3.  **Local Properties**:
    * Create a `local.properties` file in the root of the project (`EarningsTracker3/local.properties`).
    * Add the path to your Android SDK: `sdk.dir=/path/to/your/android/sdk` (replace with your actual SDK path).
4.  **Sync Project**: Open the project in Android Studio and allow Gradle to sync.
5.  **Build**:
    * **Android**: Select the `app` configuration and run on an emulator or device.
    * **iOS**: Open the Xcode project (usually found within the KMP project structure, often generated into a subfolder like `iosApp` or directly referenced from the shared framework) and run on a simulator or device. The Kotlin part of the shared code will be built as a framework for the iOS app.

## Git Configuration (Initial Setup)

If you encounter issues with Git commits failing due to an unknown author identity, you need to configure Git with your name and email. Run the following commands in your terminal:

```bash
git config --global user.email "you@example.com"
git config --global user.name "Your Name"
