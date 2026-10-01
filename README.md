## 从0到1完成SpringAI项目，包括智能助手、ChatPDF、哄哄模拟器
![3月2日](https://github.com/user-attachments/assets/015229e5-f7b7-481e-97ca-a24fdcff29cd)

## 环境要求

- **JDK 17+**
- **Maven 3.6+**
- **MySQL 8.0+**
- **Ollama**（本地安装并拉取模型）

---

## 快速开始

### 1. 克隆项目

```bash
git clone https://github.com/your-username/springai_demo.git
cd springai_demo
```

### 2. 安装 Ollama 并拉取模型

```bash
ollama pull deepseek-r1:7b
```

### 3. 配置环境变量

设置阿里云 API Key（用于云端模型访问）：

**Windows (CMD):**
```cmd
set OPENAI_API_KEY=你的阿里云DashScope_API_Key
```

**Linux / macOS:**
```bash
export OPENAI_API_KEY=你的阿里云DashScope_API_Key
```

### 4. 配置数据库

修改 `src/main/resources/application.yml` 中的数据库连接信息：

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/springai_demo?...
    username: root
    password: 你的密码
```

然后创建数据库：

```sql
CREATE DATABASE springai_demo CHARACTER SET utf8mb4;
```

### 5. 启动项目

```bash
mvnw spring-boot:run
```

项目启动后默认运行在 `http://localhost:8080` 。

---

