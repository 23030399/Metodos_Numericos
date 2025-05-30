
# Solución de Ecuaciones Diferenciales

La **solución de ecuaciones diferenciales** es un área fundamental del análisis matemático y la modelización de sistemas físicos, biológicos, económicos, entre otros. Las ecuaciones diferenciales describen la relación entre una función desconocida y sus derivadas, permitiendo modelar fenómenos de cambio continuo.

Existen distintos métodos numéricos para aproximar soluciones cuando no es posible obtener una solución analítica. A continuación se presentan algunos de los métodos más utilizados.

---

## Índice

- [Método de Euler](#método-de-euler)
- [Método de Taylor](#método-de-taylor)
- [Método de Runge-Kutta](#método-de-runge-kutta)
- [Métodos de Paso Múltiple](#métodos-de-paso-múltiple)

---

## Método de Euler

Es uno de los métodos numéricos más sencillos para resolver ecuaciones diferenciales ordinarias del tipo:

```math
\frac{dy}{dx} = f(x, y), \quad y(x_0) = y_0
```

### Fórmula

```math
y_{n+1} = y_n + h \cdot f(x_n, y_n)
```

donde:
- \( h \) es el tamaño del paso
- \( (x_n, y_n) \) es el punto actual

Es un método explícito, fácil de implementar, pero puede ser inestable si el paso \( h \) es muy grande.

---

## Método de Taylor

Este método mejora la precisión del de Euler al incluir derivadas de orden superior de \( f \).

### Fórmula (orden 2)

```math
y_{n+1} = y_n + h f(x_n, y_n) + \frac{h^2}{2} f'(x_n, y_n)
```

Para usar este método es necesario calcular derivadas parciales adicionales, lo cual puede ser complejo pero mejora significativamente la precisión.

---

## Método de Runge-Kutta

El método de **Runge-Kutta de orden 4** (RK4) es uno de los métodos más utilizados debido a su balance entre precisión y costo computacional.

### Fórmulas

```math
k_1 = f(x_n, y_n)
```

```math
k_2 = f\left(x_n + \frac{h}{2}, y_n + \frac{h}{2}k_1\right)
```

```math
k_3 = f\left(x_n + \frac{h}{2}, y_n + \frac{h}{2}k_2\right)
```

```math
k_4 = f(x_n + h, y_n + hk_3)
```

```math
y_{n+1} = y_n + \frac{h}{6}(k_1 + 2k_2 + 2k_3 + k_4)
```

Este método tiene un error local de orden \( h^5 \) y error global de orden \( h^4 \).

---

## Métodos de Paso Múltiple

A diferencia de los métodos anteriores, los métodos de paso múltiple utilizan varios valores anteriores para calcular el siguiente.

### Ejemplo: Método de Adams-Bashforth de orden 2

```math
y_{n+1} = y_n + \frac{h}{2} \left(3f(x_n, y_n) - f(x_{n-1}, y_{n-1})\right)
```

Estos métodos requieren valores iniciales que generalmente se obtienen con un método como RK4. Son eficientes para cálculos a largo plazo.

---

