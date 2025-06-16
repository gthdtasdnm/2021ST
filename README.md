
# 🔺 Altklausur 2021ST – Triangular Grid & Iterator

Dieses Projekt enthält eine vollständige Umsetzung der Aufgaben aus der **OOP-Klausur 2021ST**.

## 📁 Projektstruktur

Der Code befindet sich unter `src/` und besteht aus den folgenden Hauptkomponenten:

### 🧱 Triangle.java
- Repräsentiert ein einzelnes **elementares Dreieck** im sogenannten **Triangular Grid**
- Konstruktor überprüft gültige Koordinaten (x, y, z ∈ {0, 1})
- Methoden:
  - `getX()`, `getY()`, `getZ()` – Getter
  - `getRight()` – berechnet den rechten Nachbarn eines Dreiecks
  - `equals()`, `hashCode()`, `toString()` – zur Nutzung in Sammlungen und Ausgabe

### 🔺 CompositeTriangle.java
- Repräsentiert ein **zusammengesetztes Dreieck** mit einer beliebigen Kantenlänge `k`
- Iterierbar über alle enthaltenen elementaren Dreiecke
- Reihenfolge der Iteration: **von oben nach unten, zeilenweise von links nach rechts**
- Methode `contains(Triangle t)` überprüft, ob ein gegebenes Dreieck Teil des CompositeTriangle ist

### ▶️ Main.java
- Optionales Beispielprogramm zur manuellen Ausführung und Visualisierung

## 🧪 Tests

Die Datei `TriangleCompositeTest.java` enthält **JUnit-5-Tests** zu allen Aufgabenteilen:

- Konstruktion & Getter in `Triangle`
- `equals()` / `hashCode()` / `toString()`-Methoden
- Nachbarschaftsberechnung mit `getRight()`
- Konstruktion und Eigenschaften von `CompositeTriangle`
- Iteration über alle Dreiecke in korrekter Reihenfolge
- Prüfung der `contains()`-Methode

👉 **Zum Ausführen**: Stelle sicher, dass `JUnit 5` eingebunden ist und die Datei unter `src/test/java` liegt.

## 📚 Empfehlung

- Analysiere zuerst die Dreiecksstruktur (x, y, z)
- Verstehe die Rekonstruktion des zusammengesetzten Dreiecks über die `getRight()`-Logik
- Nutze die Tests zur Verifikation deines eigenen Codes

---

Viel Erfolg beim Durcharbeiten der Aufgaben und beim Üben für zukünftige OOP-Klausuren!
