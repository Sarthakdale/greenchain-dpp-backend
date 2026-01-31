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

## 🔌 API Documentation

### **1. Product Management**
*Manage the physical items in the chain.*

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | **/api/products** | Retrieve a list of all products |
| `POST` | **/api/products** | Register a new product |

**📝 Sample JSON (Create Product):**
```json
{
  "name": "Organic Cotton Bale",
  "type": "RAW_MATERIAL",
  "baseCo2Impact": 12.5,
  "description": "Harvested from Farm A, Batch #502"
}

2. Supply Chain Events (The Passport)
Add stamps to the product's history.
Method,Endpoint,Description
GET,/api/events?productId={id},View the full timeline of a product
POST,/api/events?productId={id},"Add a new event (e.g., Transport, Processing)"

{
  "eventType": "TRANSPORT",
  "location": "Highway NH48",
  "details": "Transported by truck GJ-01. Temp: 24C"
}

Method,Endpoint,Description
GET,/api/products/{id}/qr,Returns an Image (PNG) of the QR Code


⚙️ How to Run Locally
Clone the Repository

Bash
git clone [https://github.com/YOUR_USERNAME/greenchain-dpp-backend.git](https://github.com/YOUR_USERNAME/greenchain-dpp-backend.git)
Configure Database

Ensure PostgreSQL is running.

Create a database named greenchain_db.

Update src/main/resources/application.properties with your username/password.

Run the Engine

Open the project in IntelliJ IDEA.

Run DppEngineApplication.java.

Test

Open Postman or your Browser.

Visit: http://localhost:8080/api/products

🔮 Future Roadmap
[ ] Frontend Dashboard: Building a React.js Admin Panel.

[ ] Blockchain Integration: Hashing events for immutable security.

[ ] Consumer App: Mobile interface for scanning QR codes in stores.