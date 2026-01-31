# 🍃 GreenChain - Digital Product Passport Engine

![Java](https://img.shields.io/badge/Java-21-orange) ![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.1-green) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-blue) ![Status](https://img.shields.io/badge/Status-Operational-brightgreen)

> **"From Farm to Phone: Tracking Sustainability One Scan at a Time."**

## 📖 Overview
**GreenChain** is a robust backend engine designed to power **Digital Product Passports (DPP)**. It brings transparency to supply chains by tracking a product's entire lifecycle—from raw material harvesting to final retail delivery.

Built with **Java Spring Boot** and **PostgreSQL**, this engine acts as the "Brain" and "Memory" of the system, capable of generating unique **QR Codes** that reveal a product's true environmental story.

---

## 🚀 Key Features

* **📦 Product Inventory System:** Create and manage distinct products (Raw Materials, Components, Final Goods).
* **🔗 Dynamic Supply Chain Events:** Track the history of an item (Harvesting ➔ Processing ➔ Transport).
* **🖨️ QR Code Generation:** Auto-generates scannable PNG images for every product using the ZXing library.
* **💾 Persistent Storage:** Full PostgreSQL integration ensures data survives server restarts ("Renovation" mode).
* **🔌 RESTful API:** Fully documented endpoints ready for Frontend (React) or Mobile integration.

---

## 🛠️ Tech Stack

| Component | Technology | Description |
| :--- | :--- | :--- |
| **Backend Framework** | Java Spring Boot 3 | The core logic engine |
| **Database** | PostgreSQL 16 | Relational data storage |
| **ORM** | Hibernate / JPA | Database communication |
| **Tools** | Maven, Lombok | Dependency management & boilerplate reduction |
| **Utilities** | Google ZXing | QR Code generation library |

---

# 🍃 GreenChain - Digital Product Passport Engine

![Java](https://img.shields.io/badge/Java-21-orange) ![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.1-green) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-blue)

> **"From Farm to Phone: Tracking Sustainability One Scan at a Time."**

## 📖 Overview
**GreenChain** is a robust backend engine designed to power **Digital Product Passports (DPP)**. It brings transparency to supply chains by tracking a product's entire lifecycle—from raw material harvesting to final retail delivery.

---

## 🔌 API Documentation

### **1. Product Management**
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/products` | Retrieve a list of all products |
| `POST` | `/api/products` | Register a new product |

### **2. Supply Chain Events**
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/events?productId={id}` | View the full timeline of a product |
| `POST` | `/api/events?productId={id}` | Add a new event (e.g., Transport) |

### **3. Passport Interface**
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/products/{id}/qr` | **Returns an Image (PNG)** of the QR Code |

---

## ⚙️ How to Run Locally

1.  **Clone the Repository**
    ```bash
    git clone [https://github.com/Sarthakdale/greenchain-dpp-backend.git](https://github.com/Sarthakdale/greenchain-dpp-backend.git)
    ```
2.  **Configure Database**
    * Update `src/main/resources/application.properties` with your PostgreSQL credentials.
3.  **Run the Engine**
    * Run `DppEngineApplication.java` in IntelliJ.
