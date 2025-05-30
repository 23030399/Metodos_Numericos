
# Interpolación y Ajuste de Funciones

La **interpolación y el ajuste de funciones** son técnicas fundamentales en el análisis numérico y la estadística. Se utilizan para construir nuevas estimaciones de datos a partir de un conjunto discreto de puntos conocidos. Mientras que la **interpolación** busca encontrar una función que pase exactamente por los puntos dados, el **ajuste** intenta encontrar una función que se aproxime a esos puntos, minimizando algún tipo de error.

Estas técnicas son ampliamente utilizadas en física, ingeniería, economía, machine learning y cualquier área donde se trabaje con datos empíricos.

---

## Índice

- [Interpolación Lineal](#interpolación-lineal)
- [Interpolación Polinómica](#interpolación-polinómica)
- [Método de Regresión](#método-de-regresión)
- [Método de Correlación](#método-de-correlación)
- [Método de Mínimos Cuadrados](#método-de-mínimos-cuadrados)

---

## Interpolación Lineal

La **interpolación lineal** conecta dos puntos consecutivos mediante una recta. Es una forma simple de estimar valores intermedios.

### Fórmula

Dado dos puntos \((x_0, y_0)\) y \((x_1, y_1)\):

```math
f(x) = y_0 + rac{(y_1 - y_0)}{(x_1 - x_0)} (x - x_0)
```

---

## Interpolación Polinómica

La **interpolación polinómica** busca un único polinomio de grado \(n\) que pase por \(n+1\) puntos conocidos.

### Fórmula (Interpolación de Lagrange)

```math
P(x) = \sum_{j=0}^{n} y_j \cdot \ell_j(x)
```

donde

```math
\ell_j(x) = \prod_{\substack{0 \leq m \leq n \ m 
eq j}} rac{x - x_m}{x_j - x_m}
```

---

## Método de Regresión

La **regresión** ajusta una función a un conjunto de datos minimizando la discrepancia entre los datos observados y los valores predichos por la función.

### Regresión Lineal

```math
y = a + bx
```

---

## Método de Correlación

La **correlación** mide el grado de relación lineal entre dos variables. Se expresa mediante el **coeficiente de correlación de Pearson** \(r\).

### Fórmula

```math
r = rac{n\sum xy - \sum x \sum y}{\sqrt{(n\sum x^2 - (\sum x)^2)(n\sum y^2 - (\sum y)^2)}}
```

---

## Método de Mínimos Cuadrados

Este método encuentra los coeficientes de una función (usualmente una recta) que minimiza la suma de los cuadrados de los errores.

### Fórmulas

```math
b = rac{n\sum x_iy_i - \sum x_i \sum y_i}{n\sum x_i^2 - (\sum x_i)^2}
```

```math
a = rac{\sum y_i - b\sum x_i}{n}
```

Entonces, la recta ajustada es:

```math
y = a + bx
```

---
