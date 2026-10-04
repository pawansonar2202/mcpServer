package com.AIPortfolio.mcpServer.tool;

import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.stereotype.Component;

@Component
public class ProfileTools {

    @McpTool(
        name = "getProfile",
        description = "Get Pawan Sonar's professional profile, skills, experience and primary career focus"
    )
    public String getProfile() {

        return """
                Pawan Sonar is a Software Engineer.

                Experience:
                2+ years

                Skills:
                Java
                Spring Boot
                Microservices
                Angular
                RabbitMQ
                Redis
                Docker
                MySQL

                Primary focus:
                Java Backend Development
                """;
    }
}