package com.example.data

import com.example.data.model.GuideStep
import com.example.data.model.TutorialGuide

object TutorialsProvider {
    val guides = listOf(
        TutorialGuide(
            id = "guide_1_jarvis_setup",
            titleHindi = "Android Mobile me JARVIS AI Assistant Kaise Banaye (Full Setup Guide)",
            titleEnglish = "How to Build a Real-Life JARVIS AI Assistant on Android",
            category = "Setup",
            summaryHindi = "Apne Android phone ko Iron Man ke JARVIS jaisa smart aur voice-controlled AI assistant kaise banaye bina kisi coding ke.",
            summaryEnglish = "Transform your Android device into a futuristic Iron Man J.A.R.V.I.S. voice assistant with smart automations and custom commands.",
            steps = listOf(
                GuideStep(
                    stepNumber = 1,
                    title = "Step 1: Voice Recognition & Wake Word Setup",
                    explanationHindi = "Speech recognition engine activate karein. Settings me jaakar default assistant select karein aur Mic permission grant karein taaki JARVIS background me bhi aapki aawaz sun sake.",
                    explanationEnglish = "Enable the Speech Recognition engine, grant microphone permissions, and configure the voice input sensitivity.",
                    codeSnippetOrAction = "Voice Command: 'Jarvis, system status check karo'"
                ),
                GuideStep(
                    stepNumber = 2,
                    title = "Step 2: Iron Man Arc Reactor HUD & TTS Voice Modulation",
                    explanationHindi = "Text-to-Speech (TTS) settings me Voice Pitch ko thoda deep (0.9x) aur Speech Rate ko 1.05x par set karein taaki aawaz authentic Paul Bettany (JARVIS) jaisi robotically crisp lage.",
                    explanationEnglish = "Configure Text-To-Speech engine with custom pitch (0.9x) and robotic resonance for the authentic British AI timbre.",
                    codeSnippetOrAction = "TTS Pitch: 0.9x | Rate: 1.05x | Accent: en-GB or hi-IN"
                ),
                GuideStep(
                    stepNumber = 3,
                    title = "Step 3: Neural Brain (Gemini AI API) Connect Karein",
                    explanationHindi = "Google AI Studio se free Gemini API Key generate karke JARVIS ke neural brain me link karein. Isse JARVIS complex sawal, live calculation aur coding bhi solve kar sakega.",
                    explanationEnglish = "Connect your Gemini API Key to enable advanced reasoning, live world knowledge, and natural Hindi/English conversational flow.",
                    codeSnippetOrAction = "Model: gemini-3.5-flash"
                ),
                GuideStep(
                    stepNumber = 4,
                    title = "Step 4: Real Device Hardware Actions Link Karein",
                    explanationHindi = "JARVIS ko Flashlight, Battery Health, Camera, Dialer, Sound Profiles aur Apps launch karne ke direct permissions dein.",
                    explanationEnglish = "Link hardware triggers so JARVIS can directly toggle torch, report battery telemetry, and execute phone automations."
                )
            ),
            tryCommandPrompt = "Jarvis, system status report do",
            secretTips = listOf(
                "Tip 1: 'Hey Jarvis' bolne ke baad 1 second wait karein clear microphone pickup ke liye.",
                "Tip 2: Hindi aur English dono me natural commands bol sakte hain jaise 'Torch jala do' ya 'Turn on flashlight'."
            )
        ),
        TutorialGuide(
            id = "guide_2_automation_apps",
            titleHindi = "Android Automation Hacks & No-Coding Macro Setup",
            titleEnglish = "Android Automation Hub: No-Coding Voice Trigger Macros",
            category = "Automation",
            summaryHindi = "Bina kisi coding ke custom voice routines aur automatic phone triggers kaise banaye.",
            summaryEnglish = "Create multi-action voice macros and automated phone routines with zero programming knowledge.",
            steps = listOf(
                GuideStep(
                    stepNumber = 1,
                    title = "Step 1: Custom Voice Trigger Define Karein",
                    explanationHindi = "JARVIS Automation tab me 'Add New Macro' par tap karein. Apna custom wake phrase likhein jaise 'Party Mode', 'Study Time' ya 'Emergency'.",
                    explanationEnglish = "Open the Automation tab and create a custom trigger phrase like 'Party Mode' or 'Night Protocol'."
                ),
                GuideStep(
                    stepNumber = 2,
                    title = "Step 2: Multi-Action Sequence Assign Karein",
                    explanationHindi = "Ek phrase bolne par multiple actions execute karwayein: jaise Flashlight on hona + Volume 100% hona + Jarvis dwara briefing bolna.",
                    explanationEnglish = "Chain multiple hardware actions together (Torch toggle + Volume level + TTS Voice announcement)."
                ),
                GuideStep(
                    stepNumber = 3,
                    title = "Step 3: Test & Save Routine",
                    explanationHindi = "Routine save karein aur mic button daba kar trigger phrase bole. JARVIS instant sequence execute karega.",
                    explanationEnglish = "Save the macro into the local Room database and trigger it instantly via voice command."
                )
            ),
            tryCommandPrompt = "House party protocol",
            secretTips = listOf(
                "Stealth Mode trigger se ek command me phone silent aur flashlight off ho jati hai.",
                "Morning briefing trigger roz subah time, battery aur positive quote sunata hai."
            )
        ),
        TutorialGuide(
            id = "guide_3_ai_tricks_2026",
            titleHindi = "Top 15 Secret Android AI Tricks & Hacks 2026",
            titleEnglish = "Top 15 Secret Android AI Tricks & Hidden Hacks (2026 Edition)",
            category = "Tricks2026",
            summaryHindi = "2026 ke sabse powerful Android secret shortcuts, developer settings aur AI voice tricks.",
            summaryEnglish = "Master 15 cutting-edge Android AI shortcuts, developer tweaks, and hidden system diagnostic tricks.",
            steps = listOf(
                GuideStep(
                    stepNumber = 1,
                    title = "Trick 1: Instant Battery Calibration Scan",
                    explanationHindi = "JARVIS Battery Telemetry use karke battery voltage, health aur exact charging rate check karein to extend battery lifespan by 40%.",
                    explanationEnglish = "Inspect real-time millivolts, temperature, and battery health to maximize lithium-ion battery life."
                ),
                GuideStep(
                    stepNumber = 2,
                    title = "Trick 2: Quick Math & Conversion via Voice",
                    explanationHindi = "Mic par direct mathematical calculations bole jaise 'Calculate 1450 into 18 percent' ya '100 dollars in rupees'.",
                    explanationEnglish = "Execute instant currency conversions, percentages, and scientific formulas purely via voice."
                ),
                GuideStep(
                    stepNumber = 3,
                    title = "Trick 3: Instant SOS Strobe Torch",
                    explanationHindi = "Emergency me 'Strobe Flashlight' command dene par torch high-frequency signal pulse karti hai.",
                    explanationEnglish = "Emergency safety strobe flashing mode via rapid camera LED pulse modulation."
                ),
                GuideStep(
                    stepNumber = 4,
                    title = "Trick 4: Background App RAM Optimization",
                    explanationHindi = "System Matrix screen par jakar live RAM utilization aur free memory telemetry monitor karein.",
                    explanationEnglish = "Live RAM gauge and internal storage analyzer to identify memory leaks."
                )
            ),
            tryCommandPrompt = "Battery check karo",
            secretTips = listOf(
                "Developer Options me jakar 'Window animation scale' ko 0.5x karne se phone 2x fast feel hota hai.",
                "JARVIS TTS me speech pitch adjust karke Hindi Hinglish accent ko crisp banayein."
            )
        ),
        TutorialGuide(
            id = "guide_4_iron_man_protocols",
            titleHindi = "Iron Man Real-Life Protocols & Voice Commands List",
            titleEnglish = "Iron Man Real-Life Voice Protocols & Secret Command List",
            category = "IronManHUD",
            summaryHindi = "Tony Stark ke original JARVIS protocols ko apne phone me kaise use karein.",
            summaryEnglish = "Explore authentic Tony Stark protocols re-engineered for your Android smartphone.",
            steps = listOf(
                GuideStep(
                    stepNumber = 1,
                    title = "Protocol Alpha: 'House Party Protocol'",
                    explanationHindi = "Torch light pulsating sequence aur max sound blast ke sath energetic greeting shuru hoti hai.",
                    explanationEnglish = "Initiates party illumination, full media output, and enthusiastic audio confirmation."
                ),
                GuideStep(
                    stepNumber = 2,
                    title = "Protocol Beta: 'Stealth Protocol'",
                    explanationHindi = "Phone ko instant silent mode me convert karta hai aur sari extra lights band kar deta hai.",
                    explanationEnglish = "Switches sound profile to silent, kills all flashlights, and dims the HUD display."
                ),
                GuideStep(
                    stepNumber = 3,
                    title = "Protocol Gamma: 'Clean Slate Protocol'",
                    explanationHindi = "Sari active temporary logs clear karta hai aur cache reset briefing deta hai.",
                    explanationEnglish = "Clears chat logs, resets system telemetry, and provides a fresh system report."
                )
            ),
            tryCommandPrompt = "Stealth mode",
            secretTips = listOf(
                "JARVIS se Iron Man dialogues sunne ke liye bole: 'Tell me an Iron Man dialogue' ya 'Tony Stark quote'."
            )
        ),
        TutorialGuide(
            id = "guide_5_hindi_voice_guide",
            titleHindi = "Voice Assistant Hindi me Kaise Setup Karein (Voice Command Guide)",
            titleEnglish = "Hindi & Hinglish Voice Command Setup & Best Practices",
            category = "VoiceControl",
            summaryHindi = "Hindi aur Hinglish me seamless voice control kaise karein.",
            summaryEnglish = "How to configure fluent Hindi and Hinglish voice recognition on Android.",
            steps = listOf(
                GuideStep(
                    stepNumber = 1,
                    title = "Speech Recognizer Language Settings",
                    explanationHindi = "Android voice engine me 'Hindi (India)' aur 'English (India)' dono languages add karein taaki mixed Hinglish sentences perfectly detect ho sakein.",
                    explanationEnglish = "Enable both Hindi (India) and English (India) in Android voice typing for optimal bilingual recognition."
                ),
                GuideStep(
                    stepNumber = 2,
                    title = "Example Commands You Can Try",
                    explanationHindi = "• 'Torch on karo' / 'Torch band karo'\n• 'Battery kitni bachi hai?'\n• 'Camera open karo'\n• 'Dialer kholo'\n• 'Ek motivational quote sunao'\n• 'Phone ko smart kaise banaye'",
                    explanationEnglish = "Examples of bilingual Hindi-English commands supported out of the box."
                )
            ),
            tryCommandPrompt = "Torch on karo",
            secretTips = listOf(
                "Mic icon par tap karke natural speed me bole, JARVIS automatically text analyze karke action perform karega."
            )
        ),
        TutorialGuide(
            id = "guide_6_apk_downloader",
            titleHindi = "Android Studio me APK Downloader Kaise Banaye (DownloadManager & Scoped Storage)",
            titleEnglish = "How to Build an APK Downloader in Android Studio (DownloadManager & Scoped Storage)",
            category = "Development",
            summaryHindi = "URL se direct APK file download karne wala full Android Studio Kotlin code, Manifest permissions aur DownloadManager progress bar setup.",
            summaryEnglish = "Complete Android Studio Kotlin implementation for downloading APK files via DownloadManager with live progress, Scoped Storage, and notifications.",
            steps = listOf(
                GuideStep(
                    stepNumber = 1,
                    title = "Step 1: AndroidManifest.xml Permissions",
                    explanationHindi = "Internet aur notification permissions add karein. Android 10+ (API 29+) me Scoped Storage ki wajah se Downloads folder me save karne ke liye WRITE_EXTERNAL_STORAGE ki zaroorat nahi hoti:",
                    explanationEnglish = "Declare INTERNET and POST_NOTIFICATIONS in AndroidManifest.xml. Scoped Storage handles public Downloads directory automatically on Android 10+.",
                    codeSnippetOrAction = "<uses-permission android:name=\"android.permission.INTERNET\" />\n<uses-permission android:name=\"android.permission.POST_NOTIFICATIONS\" />"
                ),
                GuideStep(
                    stepNumber = 2,
                    title = "Step 2: DownloadManager Request Configure Karein",
                    explanationHindi = "Android system ke DownloadManager ka use karke URL se file fetch karein aur public Downloads folder me save karein:",
                    explanationEnglish = "Configure DownloadManager.Request with destination set to Environment.DIRECTORY_DOWNLOADS and MIME type application/vnd.android.package-archive.",
                    codeSnippetOrAction = "val request = DownloadManager.Request(Uri.parse(apkUrl))\n    .setTitle(\"App Update\")\n    .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, \"app.apk\")\n    .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)\nval id = downloadManager.enqueue(request)"
                ),
                GuideStep(
                    stepNumber = 3,
                    title = "Step 3: Live Progress Query Loop",
                    explanationHindi = "DownloadManager.Query() ko coroutine loop me query karke live percentage calculate karein aur UI progress bar update karein:",
                    explanationEnglish = "Query DownloadManager cursor for COLUMN_BYTES_DOWNLOADED_SO_FAR and COLUMN_TOTAL_SIZE_BYTES to update the progress indicator.",
                    codeSnippetOrAction = "val query = DownloadManager.Query().setFilterById(downloadId)\nval cursor = downloadManager.query(query)"
                ),
                GuideStep(
                    stepNumber = 4,
                    title = "Step 4: Download Complete & Error Handling",
                    explanationHindi = "BroadcastReceiver (ACTION_DOWNLOAD_COMPLETE) sunkar user ko notification dein aur status update karein.",
                    explanationEnglish = "Listen to DownloadManager.ACTION_DOWNLOAD_COMPLETE broadcast to notify the user and open the file."
                )
            ),
            tryCommandPrompt = "APK download guide dikhao",
            secretTips = listOf(
                "Android 10+ me request.setDestinationInExternalPublicDir() lagane par file automatically /storage/emulated/0/Download me save hoti hai.",
                "Notification visibility VISIBILITY_VISIBLE_NOTIFY_COMPLETED set karne se system notification drawer me live download progress bar dikhata hai."
            )
        ),
        TutorialGuide(
            id = "guide_7_jarvis_3_levels",
            titleHindi = "Android me JARVIS Kaise Banaye: 3 Levels Guide (No-Coding se Termux Python)",
            titleEnglish = "Build JARVIS on Android: 3 Levels Guide (No-Code to Termux Python)",
            category = "Setup",
            summaryHindi = "Level 1 (5 Min Gemini/Claude setup), Level 2 (Tasker/MacroDroid Automation), aur Level 3 (Termux Python AI Brain + YouTube Script).",
            summaryEnglish = "The ultimate 3-level roadmap to build your personal JARVIS on Android, from instant 5-minute no-code assistant to custom Termux Python scripts.",
            steps = listOf(
                GuideStep(
                    stepNumber = 1,
                    title = "Level 1: 5 Minute Setup (Zero Coding)",
                    explanationHindi = "1. Settings → Apps → Default apps → Digital assistant app me jakar 'Gemini' select karein.\n2. 'Hey Google' toggle on karein taaki call, music, alarm aur messages voice se control ho sakein.\n3. Claude app ka voice mode install karein intelligent Hindi conversations aur reasoning ke liye.",
                    explanationEnglish = "Configure Gemini as default digital assistant in Android settings, enabling voice actions. Complement with Claude app voice mode for fluid Hindi/English discussions.",
                    codeSnippetOrAction = "Settings → Apps → Default apps → Digital assistant → Gemini"
                ),
                GuideStep(
                    stepNumber = 2,
                    title = "Level 2: Automation Hub (Asli Smart Phone Feel)",
                    explanationHindi = "1. Play Store se 'MacroDroid' ya 'Tasker' install karein.\n2. Triggers set karein: 'Agar ye ho to wo karo' (jaise Ghar aate hi Wi-Fi ON, Raat ko DND active, Battery 100% hote hi JARVIS audio alert).\n3. Tasker + AutoVoice plugin use karke custom wake word 'Jarvis, Torch on karo' banayein.\n4. Samsung users 'Modes & Routines' (Bixby Routines) se zero battery drain automations bana sakte hain.",
                    explanationEnglish = "Use MacroDroid or Tasker with AutoVoice plugin for conditional event triggers. Samsung users can leverage native Modes & Routines without battery penalty.",
                    codeSnippetOrAction = "Trigger: AutoVoice ('Jarvis Torch') → Action: Toggle Flashlight"
                ),
                GuideStep(
                    stepNumber = 3,
                    title = "Level 3: Asli JARVIS (Termux + Python Script Setup)",
                    explanationHindi = "1. F-Droid se Termux app install karein.\n2. Python aur dependencies install karein: pkg install python git && pip install google-genai speechrecognition gTTS\n3. Python script run karein jo mic se voice record karke Gemini API ko bhejti hai aur gTTS se authentic JARVIS voice bolkar sunati hai.\n4. Background run ke liye Termux:Boot ya Termux:Widget use karein.",
                    explanationEnglish = "Run an on-device Python micro-agent inside Termux connected to Gemini API, capturing audio via Termux-API and speaking back via Google Text-To-Speech.",
                    codeSnippetOrAction = "pkg install python -y\npip install google-genai gTTS playsound"
                ),
                GuideStep(
                    stepNumber = 4,
                    title = "Level 4: YouTube & Blog Video Script Template",
                    explanationHindi = "Content creators ke liye ready-to-use script:\n• Hook (0:00-0:30): 'Kash Iron Man jaisa JARVIS aapke phone me hota? Aaj main aapko 3 tarike bataunga...'\n• Level 1 Demo (0:30-2:00): Gemini default assistant setup\n• Level 2 Demo (2:00-4:30): MacroDroid / Tasker auto routines\n• Level 3 Demo (4:30-7:00): Termux Python wake-word script\n• Conclusion & CTA: Best combo = Level 1 + Level 2!",
                    explanationEnglish = "Full YouTube & Blog script breakdown with hook, timestamps, demonstration flow, and audience call to action."
                )
            ),
            tryCommandPrompt = "Jarvis, automate my device",
            secretTips = listOf(
                "Pro Tip: Zyada tar users Level 1 + Level 2 ka combo use karte hain kyunki ye 100% stable hai aur battery drain nahi karta.",
                "Samsung devices me 'Modes and Routines' se direct MacroDroid jaise triggers bina kisi third-party app ke ban sakte hain."
            )
        )
    )
}
