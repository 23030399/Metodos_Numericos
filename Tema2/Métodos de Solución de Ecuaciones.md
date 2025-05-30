
# Métodos de Solución de Ecuaciones

La solución de ecuaciones no lineales es un aspecto fundamental en matemáticas aplicadas, ciencias e ingeniería. En muchos casos, las ecuaciones no tienen una solución explícita, por lo que se emplean **métodos numéricos** que permiten aproximar la solución deseada con una precisión determinada.

A continuación, se describen algunos de los métodos más comunes para encontrar raíces de funciones no lineales de la forma \( f(x) = 0 \).

---

## Índice

- [Método de Bisección](#método-de-bisección)
- [Método del Punto Fijo](#método-del-punto-fijo)
- [Método de la Secante](#método-de-la-secante)
- [Método de la Regla Falsa](#método-de-la-regla-falsa)
- [Método de Newton-Raphson](#método-de-newton-raphson)

---

## Método de Bisección

Este método requiere que la función \( f(x) \) cambie de signo en un intervalo \([a, b]\), es decir, \( f(a) \cdot f(b) < 0 \).

### Algoritmo
1. Calcular el punto medio: \( c = \frac{a + b}{2} \)
2. Evaluar \( f(c) \)
3. Si \( f(a) \cdot f(c) < 0 \), entonces la raíz está en \([a, c]\); de lo contrario, en \([c, b]\)
4. Repetir hasta que \( |f(c)| \) o el tamaño del intervalo sea menor que una tolerancia dada.

### Fórmula

```math
c = \frac{a + b}{2}
```

---

## Método del Punto Fijo

Se transforma la ecuación \( f(x) = 0 \) en la forma \( x = g(x) \), y se utiliza iterativamente:

### Algoritmo
1. Elegir una aproximación inicial \( x_0 \)
2. Calcular \( x_{n+1} = g(x_n) \)
3. Repetir hasta que \( |x_{n+1} - x_n| < \text{tolerancia} \)

### Fórmula

```math
x_{n+1} = g(x_n)
```

---

## Método de la Secante

Es un método que utiliza dos aproximaciones iniciales y evita calcular derivadas.

### Algoritmo
1. Se escogen \( x_0 \) y \( x_1 \)
2. Calcular iterativamente:

```math
x_{n+1} = x_n - f(x_n) \cdot \frac{x_n - x_{n-1}}{f(x_n) - f(x_{n-1})}
```

3. Repetir hasta que se alcance la tolerancia deseada.

---

## Método de la Regla Falsa (False Position)

Combina ideas del método de bisección y secante: usa el cambio de signo como la bisección, pero el punto medio se calcula con la fórmula de la secante.

### Algoritmo
1. Se elige un intervalo \([a, b]\) tal que \( f(a) \cdot f(b) < 0 \)
2. Calcular:

```math
c = b - f(b) \cdot \frac{b - a}{f(b) - f(a)}
```

3. Usar el cambio de signo para actualizar el intervalo como en bisección
4. Repetir hasta cumplir la condición de parada

---

## Método de Newton-Raphson

Este método utiliza la derivada de \( f \) para encontrar la raíz rápidamente.

### Algoritmo
1. Elegir una aproximación inicial \( x_0 \)
2. Iterar con la fórmula:

```math
x_{n+1} = x_n - \frac{f(x_n)}{f'(x_n)}
```

3. Repetir hasta que \( |x_{n+1} - x_n| < \text{tolerancia} \)

### Ventajas
- Alta velocidad de convergencia
- Requiere derivada de la función

---

Cada uno de estos métodos tiene ventajas y desventajas. La elección del método depende del problema, la información disponible (derivadas, continuidad, etc.), y el nivel de precisión requerido.
