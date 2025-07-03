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
- 🔄 **Dynamic FXML loading** (e.g. `ItemController.java`) for modular item injection
- ⚙️ **Java modular structure** supported via `module-info.java`

---

## 🧱 Component Overview

```
market.fxml            → Main layout, language switcher, account, delivery banners  
item.fxml              → Reusable card for product name, price, image (Kiwi, Cherry, etc.)  
MarketController.java  → Populates fruit grid, sets selection styling  
ItemController.java    → Binds dynamic card data (name, price, image) via @FXML  
style.css              → Unified styling: cards, layout, color palette  
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
├── model/
│   └── Fruit.java
├── resources/
│   ├── views/
│   │   ├── market.fxml
│   │   └── item.fxml
│   ├── values/
│   │   └── style.css
│   └── img/
│       ├── kiwi.png
│       ├── cherry.png
│       ├── peach.png
│       ├── ic_cart.png
│       ├── ic_delivery.png
│       └── ic_stopwatch.png
└── module-info.java
```

---

## 🛠️ Tech Stack

- [JavaFX 17](https://openjfx.io/) – modern GUI framework
- FXML – XML-based UI layout
- Java 17 – modular application support
- CSS – responsive, custom styling
- IntelliJ IDEA / CLion – recommended development environments

---

## 💼 Powered by NURO

This project is part of **NURO** — a creative suite by Nzabanita focused on building futuristic, minimalist digital experiences with style and precision.

> ✨ NURO blends elegant branding with functional software design.

---

## 📸 Preview

> _Design showcase coming soon!_

<!-- Uncomment this line when preview image is added -->
<!-- ![FruityMart Preview](resources/img/screen1.png) -->

---

## 🔧 How to Run

1. Clone this repo to your machine
2. Open in IntelliJ or CLion with JavaFX + Java 17 SDK configured
3. Set `/resources` as your Resources Root
4. Run `Main.java`
5. Enjoy the FruityMart experience 🍊

---

## 🤝 Contributing

Feel free to fork, branch, or build on top of the FruityMart foundation. Whether you're improving visuals, extending logic, or porting new fruits—your creativity is welcome 🍓

---

## 📜 License

Licensed under the [MIT License](LICENSE) — free to use, enhance, and replant 🍋

---

## 👤 Author

**Nzabanita**  
Creative engineer · DevOps dreamer · Visual storyteller  
Crafting FruityMart and NURO from Kampala with ☕ & imagination  
🌍 Coming soon: portfolio & links

---
