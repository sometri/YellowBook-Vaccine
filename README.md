# Vaccin Project

Welcome to the Vaccine project! This project is an Android application built using Java in Android Studio. It is designed to help users manage and record child vaccinations. This guide will walk you through the structure of the project and provide instructions on how to set it up and use it.

## Project Structure

```
vaccin/
 ├── src/
 │    └── main/
 │         ├── java/
 │         │    └── com/
 │         │         └── sometri/
 │         │              └── vaccin/
 │         │                   ├── MainActivity.java
 │         │                   ├── RegisterChildActivity.java
 │         │                   ├── RecordVaccinationActivity.java
 │         │                   ├── RecordVaccineActivity.java
 │         │                   ├── ViewRecordsActivity.java
 │         │                   ├── VaccinationRecordAdapter.java
 │         │                   ├── models/
 │         │                   │    ├── Child.java
 │         │                   │    ├── Vaccine.java
 │         │                   │    └── VaccinationRecord.java
 │         │                   └── database/
 │         │                        └── DatabaseHelper.java
 │         └── res/
 │              ├── layout/
 │              │    ├── activity_main.xml
 │              │    ├── activity_register_child.xml
 │              │    ├── activity_record_vaccination.xml
 │              │    ├── activity_record_vaccine.xml
 │              │    ├── activity_view_records.xml
 │              │    └── item_vaccination_record.xml
 │              └── values/
 │                   └── strings.xml
 └── AndroidManifest.xml
```

## Getting Started

### Prerequisites

- Android Studio installed on your computer.
- An Android device or emulator to run the application.

### Installation

1. **Clone the Repository**

   Open your terminal and run:
   ```bash
   git clone https://github.com/yourusername/vaccin.git
   ```

2. **Open the Project in Android Studio**

   - Launch Android Studio.
   - Click on "Open an existing Android Studio project".
   - Navigate to the location where you cloned the repository and select the `vaccin` folder.
   - Wait for Android Studio to index and set up the project.

3. **Run the Application**

   - Connect your Android device to your computer or start an Android emulator.
   - Click on the "Run" button in Android Studio or press `Shift + F10`.

## Project Components

### MainActivity.java

This is the entry point of the application. It displays the main menu where users can navigate to different parts of the app.

### RegisterChildActivity.java

This activity allows users to register a new child. It collects details like the child's name, date of birth, and other relevant information.

### RecordVaccinationActivity.java

This activity is used to record a vaccination given to a child. Users can select the child and enter details about the vaccination.

### RecordVaccineActivity.java

This activity allows users to add new vaccines to the system. It includes fields for the vaccine name, type, and other details.

### ViewRecordsActivity.java

This activity displays a list of all recorded vaccinations. Users can view detailed information about each vaccination record.

### VaccinationRecordAdapter.java

This is an adapter class used to bind vaccination records to the `RecyclerView` in the `ViewRecordsActivity`.

### Models

- **Child.java**: Represents a child entity with attributes like name, date of birth, etc.
- **Vaccine.java**: Represents a vaccine entity with attributes like vaccine name, type, etc.
- **VaccinationRecord.java**: Represents a vaccination record entity linking a child to a vaccine and the date it was administered.

### DatabaseHelper.java

This class handles database creation, version management, and provides methods for CRUD operations on the child, vaccine, and vaccination record tables.

## XML Layout Files

- **activity_main.xml**: Layout for the main activity.
- **activity_register_child.xml**: Layout for the register child activity.
- **activity_record_vaccination.xml**: Layout for the record vaccination activity.
- **activity_record_vaccine.xml**: Layout for the record vaccine activity.
- **activity_view_records.xml**: Layout for viewing vaccination records.
- **item_vaccination_record.xml**: Layout for individual items in the vaccination records list.

## strings.xml

This file contains string resources used throughout the application.

## AndroidManifest.xml

The manifest file describes essential information about the app to the Android build tools, the Android operating system, and Google Play.

## Usage

1. **Register a Child**
   - Open the app and navigate to "Register Child".
   - Fill in the required details and save.

2. **Add a Vaccine**
   - Navigate to "Record Vaccine".
   - Enter the vaccine details and save.

3. **Record a Vaccination**
   - Navigate to "Record Vaccination".
   - Select the child and the vaccine, and enter the vaccination details.

4. **View Vaccination Records**
   - Navigate to "View Records".
   - Browse through the list of recorded vaccinations.

## Contributing

If you wish to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a pull request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

---

Thank you for using Vaccine! If you have any questions or need further assistance, feel free to open an issue in the repository.
