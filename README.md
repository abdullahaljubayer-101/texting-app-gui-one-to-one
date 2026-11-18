# 💬 Texting App (GUI, One-to-One)

![Java](https://img.shields.io/badge/Java-19-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-19-007396?style=flat-square)
![Sockets](https://img.shields.io/badge/Networking-TCP%20Sockets-blueviolet?style=flat-square)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)

A real-time **one-to-one chat app** with a desktop GUI, built with **JavaFX and Java sockets**. One window acts as the server, the other as the client, and they can message each other instantly in a chat-bubble style interface. 💭

This is the GUI version of my [terminal one-to-one chat](https://github.com/abdullahaljubayer-101/texting-app-terminal-one-to-one). Same networking idea, but with a proper interface on top.

---

## ✨ Features

- ⚡ **Real-time messaging** between two windows over TCP
- 🪟 Separate **Server** and **Client** windows
- 🫧 Chat-bubble style message list that scrolls as new messages arrive
- 🧵 A background thread listens for incoming messages, so the UI never freezes

## 🧠 How it works

```text
┌──────────────┐     TCP socket (localhost:1234)     ┌──────────────┐
│  MainServer   │ ◄─────────────────────────────────► │  MainClient   │
│  (JavaFX UI)  │                                      │  (JavaFX UI)  │
└──────────────┘                                      └──────────────┘
```

- `Server.java` opens a `ServerSocket` on port **1234** and waits for the client.
- `Client.java` connects to `localhost:1234`.
- Each side reads messages on a separate thread and pushes them to the UI with `Platform.runLater`.

## 🚀 Run it

**Requirements:** JDK 19+, Maven, and an IDE like IntelliJ IDEA.

1. Open the project in **IntelliJ IDEA** (it will pick up `pom.xml`).
2. Run **`MainServer`** first.
3. Run **`MainClient`**.
4. Start chatting! 🎉

You can also start the client from the terminal:

```bash
mvn clean javafx:run
```

## 📁 Project structure

```text
src/main/java/com/example/textingappguionetoone/
├── MainServer.java             # Launches the server window
├── MainServerController.java   # Server UI logic
├── Server.java                 # Server socket + message I/O
├── MainClient.java             # Launches the client window
├── MainClientController.java   # Client UI logic
└── Client.java                 # Client socket + message I/O
src/main/resources/.../
├── server.fxml
└── client.fxml
```

## 🔗 Related projects

- 🖥️ [Texting App: Terminal, One-to-One](https://github.com/abdullahaljubayer-101/texting-app-terminal-one-to-one)
- 👥 [Texting App: Terminal, One-to-Many (group chat)](https://github.com/abdullahaljubayer-101/texting-app-terminal-one-to-many)

---

Made by **Abdullah Al Jubayer** · [GitHub](https://github.com/abdullahaljubayer-101) · [Portfolio](https://abdullahaljubayer.com)
