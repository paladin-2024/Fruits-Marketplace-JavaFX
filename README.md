# 🍇 FruityMart – A Delightful JavaFX Fruit Market Experience
_Part of the **NURO** creative suite by Nzabanita_

FruityMart is a sleek and interactive desktop application built with **JavaFX** and styled using **custom CSS**, offering a beautifully minimal interface to explore and purchase fresh fruits. With a dynamic product catalog, vibrant UI theming, and modular MVC components, FruityMart blends functionality with elegance under the NURO design philosophy.

---

## 🚀 Features

- 💡 **JavaFX-powered UI** for native responsiveness and smooth interaction
- 🎨 **Custom CSS styling** with reusable classes, shadows, radius, and vibrant color themes
- 🧱 **Fully dynamic fruit card grid** generated via `FXMLLoader` and injected at runtime
- 🖼️ **Interactive fruit selection** updates the preview card with matching price, name, image, and custom background
- 🌐 **Localized header bar** with language support, account panel, and cart icon
- 🛍️ **Promotional panels** advertising free delivery and same-day shopping
- 🔍 **Modern search bar UI (non-functional placeholder for now)**
- 🧭 **MVC architecture** using FXML, Controllers, and POJO data models
- ⚙️ **Java module system** via `module-info.java` for clean project structure

---

## 🧱 Component Overview

```
market.fxml            → Master layout: header, banners, grid, side panel  
item.fxml              → Reusable fruit card for product grid  
MarketController.java  → Loads items dynamically, updates preview card  
ItemController.java    → Binds `Fruit` model to each card’s UI  
Fruit.java             → Plain data model with name, price, imageSrc, and hex color  
style.css              → Custom styling for layout components  
```

---

## 🍉 Supported Fruits

| Name        | Image                        | Hex Color |
|-------------|------------------------------|-----------|
| Kiwi        | `/img/kiwi.png`              | `#6A7324` |
| Coconut     | `/img/coconut.png`           | `#A7745B` |
| Grapes      | `/img/grapes.png`            | `#291036` |
| Watermelon  | `/img/watermelon.png`        | `#F85D03` |
| Orange      | `/img/orange.png`            | `#22371D` |
| Strawberry  | `/img/strawberry.png`        | `#88080C` |
| Mango       | `/img/mango.png`             | `#FF8605` |
| Cherry      | `/img/cherry.png`            | `#5F060E` |
| Banana      | `/img/banana.png`            | `#E7C00F` |

---

## 📂 Folder Structure

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
│       ├── coconut.png
│       ├── grapes.png
│       ├── watermelon.png
│       ├── orange.png
│       ├── strawberry.png
│       ├── mango.png
│       ├── cherry.png
│       ├── banana.png
│       ├── ic_cart.png
│       ├── ic_delivery.png
│       └── ic_stopwatch.png
└── module-info.java
```

---

## 💼 Powered by NURO

This project is part of **NURO** — a creative suite envisioned by Nzabanita, focused on building futuristic, minimalist digital experiences with style and precision.

> ✨ NURO blends elegant branding with functional software design.

---

## 📸 Preview
> _Coming soon: App screenshots with preview card, fruit grid, and themed UI._

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
