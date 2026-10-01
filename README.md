##从0到1完成SpringAI项目，包括智能助手、ChatPDF、哄哄模拟器
![3月2日](https://github.com/user-attachments/assets/015229e5-f7b7-481e-97ca-a24fdcff29cd)

# Spring AI Demo

基于 **Spring Boot 3.4 + Spring AI 1.0.0-M6** 构建的 AI 智能应用演示项目，集成本地模型（Ollama）和云端大模型（阿里云 DashScope），实现了多场景 AI 对话、PDF 文档问答（RAG）以及 AI 驱动的课程预约系统。

---

## 功能特性

| 功能 | 说明 |
|------|------|
| 智能聊天 | 支持纯文本和**多模态**（图片/文件）对话，默认使用 DeepSeek-R1:7B（Ollama） |
| 客服助手 | AI 自动查询课程、校区，并生成预约单，支持 **Function Calling** |
| 游戏助手 | 特定人设的 AI 游戏伙伴 |
| PDF 文档问答 | 上传 PDF → 向量化存储 → 基于 **RAG** 的智能问答 |
| 阿里云模型适配 | 自定义 `AlibabaOpenAiChatModel`，无缝对接 DashScope（Qwen-Plus 等） |
| 会话记忆 | 基于 `ChatMemory` 的多轮对话记忆 |

---

## 技术栈

| 组件 | 版本/说明 |
|------|-----------|
| Spring Boot | 3.4.3 |
| Spring AI | 1.0.0-M6 |
| Java | 17 |
| Ollama | DeepSeek-R1:7B（本地模型） |
| 阿里云 DashScope | Qwen-Plus / Qwen3-Omni-Flash（云端模型） |
| 阿里云 Embedding | text-embedding-v4（向量化，1024 维） |
| MyBatis-Plus | 3.5.10.1 |
| MySQL | 数据持久化 |
| Lombok | 简化代码 |

---

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


