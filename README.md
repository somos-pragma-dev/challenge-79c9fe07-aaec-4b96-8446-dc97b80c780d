# Implementación de un servidor HTTP con Ktor

En el contexto de una fintech que necesita un servidor HTTP robusto para manejar solicitudes de clientes, se ha identificado una brecha en el conocimiento para implementar un servidor utilizando Ktor. El servidor debe manejar solicitudes HTTP, persistir datos utilizando Exposed ORM y autenticar usuarios con JWT. Los actores involucrados son el cliente, el servidor y el sistema de autenticación. El servidor debe manejar un volumen de 1 500 solicitudes por segundo en hora pico y garantizar la idempotencia de las solicitudes utilizando un identificador único por operación. En caso de fallo del sistema de autenticación, el servidor debe continuar operando y notificar el incidente.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | servidor-http-con-ktor |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Gradle 8+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `gradle build` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración del entorno

**Objetivo:** Establecer un entorno de desarrollo para el servidor HTTP con Ktor.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Configurar el proyecto para utilizar Ktor y Exposed ORM.
- Establecer las dependencias necesarias para JWT.

**Entregable:** Entorno de desarrollo configurado con Ktor, Exposed ORM y JWT.

<details>
<summary>Pistas de conocimiento</summary>

- Explorar la documentación de Ktor para entender la configuración básica.
- Identificar las dependencias necesarias para JWT y cómo integrarlas.

</details>

### Fase 2: Implementación de rutas HTTP

**Objetivo:** Crear rutas HTTP para manejar solicitudes de clientes.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Definir rutas para manejar solicitudes GET y POST.
- Implementar la lógica para persistir datos utilizando Exposed ORM.

**Entregable:** Servidor HTTP con rutas definidas y lógica de persistencia implementada.

<details>
<summary>Pistas de conocimiento</summary>

- Explorar la documentación de Ktor para definir rutas.
- Utilizar Exposed ORM para interactuar con la base de datos.

</details>

### Fase 3: Autenticación con JWT

**Objetivo:** Implementar la autenticación de usuarios utilizando JWT.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Configurar JWT para autenticar solicitudes.
- Verificar tokens JWT en las rutas protegidas.

**Entregable:** Servidor HTTP con autenticación de usuarios implementada utilizando JWT.

<details>
<summary>Pistas de conocimiento</summary>

- Explorar la documentación de JWT para configurar la autenticación.
- Implementar middleware para verificar tokens JWT.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es Ktor y para qué se utiliza en este contexto?
- **paraQueSirve**: ¿Para qué sirve Exposed ORM en la implementación del servidor?
- **comoSeUsa**: ¿Cómo se usa JWT para autenticar usuarios en el servidor?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar un servidor HTTP con Ktor y cómo se pueden manejar?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de la autenticación con JWT en el servidor?

## Criterios de Evaluacion

- Configuración correcta del entorno de desarrollo con Ktor, Exposed ORM y JWT.
- Implementación de rutas HTTP funcionales para manejar solicitudes.
- Autenticación de usuarios utilizando JWT de manera efectiva.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
