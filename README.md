# 🍇 FruityMart – A Delightful JavaFX Fruit Market Experience
_Part of the **NURO** creative suite by Nzabanita_

FruityMart is a sleek and interactive desktop application built with **JavaFX** and styled using **custom CSS**, offering a beautifully minimal interface to explore and purchase fresh fruits. From its clean, scrollable product grid to modern delivery panels and reusable item components, FruityMart blends functionality with elegance under the NURO design philosophy.

---

## 🚀 Features

- 💡 **JavaFX-powered UI** for responsive, native-like application flow
- 🎨 **Custom CSS styling** with shadows, rounded cards, and color themes
- 🌐 **Language & account panel** with localization elements and cart icon
- 🛍️ **Promotional info cards** for free delivery & online shopping
- 🔍 **Search bar** for smooth product filtering
- 🍑 **Product showcase panel** with quantity controls, previews, and add-to-cart logic
- 🧱 **Reusable fruit item cards** with bound data from controller
- 🧭 **FXML + Controller binding** (e.g. `ItemController.java`) for dynamic UI loading
- ⚙️ Modular app structure with Java module support via `module-info.java`

---

## 🧱 Component Architecture

```
market.fxml            → Main layout, language switcher, account, delivery banners
Item.fxml              → Reusable card for product name, price, image (Cherry, Apple, etc.)
MarketController.java  → Binds UI events (search, navigation, etc.)
ItemController.java    → Binds dynamic card data (name, price, image) via @FXML
style.css              → Unified styling: cards, shadows, color palette
```

---

## 📂 Project Structure

```
fruits_market_app/
├── Controller/
│   ├── MarketController.java
│   └── ItemController.java
├── main/
│   └── Main.java
├── resources/
│   ├── views/
│   │   ├── market.fxml
│   │   └── Item.fxml
│   ├── values/
│   │   └── style.css
│   └── img/
│       ├── cherry.png
│       ├── peach.png
│       ├── ic_cart.png
│       ├── ic_delivery.png
│       └── ic_stopwatch.png
└── module-info.java
```

---

## 🛠️ Tech Stack

- [JavaFX 17](https://openjfx.io/) – for elegant GUI frameworking
- FXML – UI declarative markup for view separation
- Java 17 – modular application base
- CSS – custom stylings for elevation and branding
- IntelliJ IDEA or CLion – preferred environments for JavaFX and modular Java projects

---

## 💼 Powered by NURO

This project is part of **NURO** — a creative suite envisioned by Nzabanita focused on building futuristic, minimalist digital experiences with style and precision.

> ✨ NURO blends elegant branding with functional software design.

---

## 📸 Preview (Coming Soon!)

> GIFs and static screens will be added soon to showcase Cherry item cards, promotional panels, and scrollable product views.

---

## 🔧 How to Run

1. Clone this repo to your machine
2. Open in IntelliJ or CLion with JavaFX + Java 17 SDK configured
3. Make sure `/resources` is set as your Resources Root
4. Run `Main.java`
5. Enjoy the FruityMart experience 🍊

---

## 🤝 Contributing

Feel free to fork, branch, or build on top of the FruityMart foundation. Whether you're improving visuals, extending the logic, or porting new fruits—your creativity is welcome 🍓

---

## 📜 License

Licensed under [MIT License](LICENSE) — free to use, enhance, and replant 🍋.

---

## 👤 Author

**Nzabanita**  
Creative engineer, DevOps dreamer, visual storyteller  
Crafting FruityMart and NURO from Kampala with ☕ & imagination  
Reach me at: *coming soon!*

---
