# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Contexto técnico original
Servidor HTTP con Ktor, Exposed ORM y JWT

### Reto
- Tema: servidor-http-con-ktor
- Seniority: junior-l2
- Tipo: practical
- Título: Implementación de un servidor HTTP con Ktor
- Tiempo estimado: 8 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Configuración del entorno — objetivo: Establecer un entorno de desarrollo para el servidor HTTP con Ktor. — entregable (NO resolver): Entorno de desarrollo configurado con Ktor, Exposed ORM y JWT.
- Fase 2: Implementación de rutas HTTP — objetivo: Crear rutas HTTP para manejar solicitudes de clientes. — entregable (NO resolver): Servidor HTTP con rutas definidas y lógica de persistencia implementada.
- Fase 3: Autenticación con JWT — objetivo: Implementar la autenticación de usuarios utilizando JWT. — entregable (NO resolver): Servidor HTTP con autenticación de usuarios implementada utilizando JWT.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:
// === ARCHIVO: build.gradle.kts ===
plugins {
    kotlin("jvm") version "1.9.20"
    id("io.ktor.plugin") version "2.3.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:2.3.10")
    implementation("io.ktor:ktor-server-netty:2.3.10")
    implementation("org.jetbrains.exposed:exposed-core:0.39.2")
    implementation("org.jetbrains.exposed:exposed-dao:0.39.2")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.39.2")
    implementation("io.ktor:ktor-auth-jwt:2.3.10")
    testImplementation("io.ktor:ktor-server-tests:2.3.10")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.9.20")
}

ktor {
    fatJar {}
}

// === ARCHIVO: src/main/kotlin/com/fintech/server/Application.kt ===
package com.fintech.server

import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import com.fintech.server.config.DatabaseConfig
import com.fintech.server.routes.UserRoutes
import com.fintech.server.security.SecurityConfig

fun main() {
    DatabaseConfig.init()
    embeddedServer(Netty, port = 8080) {
        SecurityConfig.configure(this)
        UserRoutes.configure(this)
    }.start(wait = true)
}

// === ARCHIVO: src/main/kotlin/com/fintech/server/config/DatabaseConfig.kt ===
package com.fintech.server.config

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction
import com.fintech.server.model.User

object DatabaseConfig {
    fun init() {
        Database.connect("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", driver = "org.h2.Driver")
        transaction {
            SchemaUtils.create(User)
        }
    }
}

// === ARCHIVO: src/main/kotlin/com/fintech/server/routes/UserRoutes.kt ===
package com.fintech.server.routes

import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing
import com.fintech.server.model.User
import org.jetbrains.exposed.sql.transactions.transaction

object UserRoutes {
    fun configure(routing: io.ktor.routing.Routing) {
        routing {
            get("/users") {
                val users = transaction {
                    User.all()
                }
                call.respond(users)
            }
            post("/users") {
                val user = call.receive<User>()
                transaction {
                    User.save(user)
                }
                call.respond(HttpStatusCode.Created)
            }
        }
    }
}

// === ARCHIVO: src/main/kotlin/com/fintech/server/model/User.kt ===
package com.fintech.server.model

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.transactions.transaction

object User : IntIdTable() {
    val name = varchar("name", 50)
    val email = varchar("email", 50)
}

data class UserDTO(val id: Int, val name: String, val email: String)

fun ResultRow.toUserDTO() = UserDTO(this[User.id], this[User.name], this[User.email])

fun User.all(): List<UserDTO> = transaction {
    User.selectAll().map { it.toUserDTO() }
}

fun User.save(user: UserDTO) = transaction {
    User.insert {
        it[name] = user.name
        it[email] = user.email
    }
}

// === ARCHIVO: src/main/kotlin/com/fintech/server/security/SecurityConfig.kt ===
package com.fintech.server.security

import io.ktor.application.ApplicationCallPipeline
import io.ktor.application.call
import io.ktor.auth.Authentication
import io.ktor.auth.authenticate
import io.ktor.auth.jwt.jwt
import io.ktor.auth.principal
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.Routing
import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.auth0.jwt.interfaces.DecodedJWT
import com.auth0.jwt.interfaces.JWTVerifier

object SecurityConfig {
    private val secret = "secret"
    private val algorithm = Algorithm.HMAC256(secret)
    private val verifier: JWTVerifier = JWT.require(algorithm).build()

    fun generateToken(userId: String): String {
        return JWT.create()
           .withClaim("userId", userId)
           .sign(algorithm)
    }

    fun verifyToken(token: String): DecodedJWT? {
        return try {
            verifier.verify(token)
        } catch (e: Exception) {
            null
        }
    }

    fun configure(routing: Routing) {
        routing.authenticate("jwt") {
            get("/protected") {
                val principal = call.principal<JWTPrincipal>()
                val userId = principal?.payload?.getClaim("userId")?.asString()
                call.respond("Welcome, $userId! This is a protected route.")
            }
        }
    }
}

// === ARCHIVO: src/main/resources/application.conf ===
ktor {
    deployment {
        port = 8080
    }
    application {
        modules = [ com.fintech.server.ApplicationKt.module ]
    }
    auth {
        jwt {
            realm = "ktor"
            verifier {
                // Aquí se configurará el verifier de JWT
            }
        }
    }
}

// === ARCHIVO: src/test/kotlin/com/fintech/server/UserRoutesTest.kt ===
package com.fintech.server

import io.ktor.application.ApplicationCall
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import io.ktor.util.KtorExperimentalAPI
import com.fintech.server.config.DatabaseConfig
import com.fintech.server.model.UserDTO
import org.junit.Test
import kotlin.test.assertEquals

@KtorExperimentalAPI
class UserRoutesTest {

    @Test
    fun `test get users`() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/users").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    @Test
    fun `test create user`() {
        withTestApplication({ module(testing = true) }) {
            val user = UserDTO(0, "Test User", "test@example.com")
            handleRequest(HttpMethod.Post, "/users").apply {
                addHeader(HttpHeaders.ContentType, ContentType.Application.Json.toString())
                setBody(Json.encodeToString(user))
                assertEquals(HttpStatusCode.Created, response.status())
            }
        }
    }
}

```
