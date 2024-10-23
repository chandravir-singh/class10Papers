Class 10 Paper Download App
This Android application is designed to help Class 10 students easily download subject-specific question papers (Paper 1 & Paper 2) from Google Drive. The app allows users to select a subject and download the relevant papers directly to their device, providing quick access to essential study materials.

Features
Subject Selection: Students can select from a list of subjects like Mathematics, Science, and English.
Paper Downloads: For each subject, two buttons are provided for downloading Paper 1 and Paper 2, which are hosted on Google Drive.
Customizable Google Drive Links: Administrators or developers can easily change the download links by modifying the source code to point to updated papers.
Simple UI/UX: The app features a user-friendly interface that simplifies the process of finding and downloading papers.
Screenshots
1. Home Screen (Subject Selection)
This screen allows users to select the subject they are interested in.
![Screenshot_2024-10-23-23-36-07-428_com chandravir class10app](https://github.com/user-attachments/assets/98f0805e-c26c-4a2d-8193-a528b18622c3)

![Screenshot_2024-10-23-23-36-09-704_com chandravir class10app](https://github.com/user-attachments/assets/acefa287-46ff-4e77-b60d-065446fec6ff)

2. Paper Download Screen
After selecting a subject, users can choose to download Paper 1 or Paper 2 by clicking the appropriate button.


![Screenshot_2024-10-23-23-36-11-844_com chandravir class10app](https://github.com/user-attachments/assets/2cb0bac6-5500-4710-9b7b-b2b41f17e5aa)


Installation
Step 1: Clone the Repository
bash
Copy code
git clone [https://github.com/y/class10-paper-download-app.git](https://github.com/chandravir-singh/class10Papers.git)
Step 2: Open in Android Studio
Open Android Studio.
Click File > Open and select the cloned repository.
Build the project and run it on your Android emulator or physical device.
How to Use
Select a Subject: Open the app and tap the button for the subject you want to access.
Download Papers: Once you select a subject, click the buttons labeled "Download Paper 1" or "Download Paper 2" to download the respective question paper. The papers will be downloaded from the provided Google Drive links.
Customization
You can customize the app to fit your needs:

Add More Subjects: In the DownloadPapersActivity.kt, you can add more subjects and corresponding papers by updating the papers map.
Update Google Drive Links: Replace the placeholder Google Drive links in the code with your own links for Paper 1 and Paper 2. The current format for links is:
kotlin
Copy code
"https://drive.google.com/uc?export=download&id=YOUR_FILE_ID"
Contributing
Fork the repository.
Create a new branch (git checkout -b new-feature).
Commit your changes (git commit -m 'Add some feature').
Push to the branch (git push origin new-feature).
Open a pull request.
License
This project is licensed under the MIT License - see the LICENSE file for details.
