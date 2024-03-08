# Microservices Overview

## Description
This repository contains a set of microservices developed using Spring Boot for currency exchange and conversion. The microservices architecture is implemented to handle currency exchange and conversion operations efficiently and independently.

## Components
1. **Currency Exchange Service**
   - **Description:** Handles currency exchange operations.
   - **Endpoint:** `/currency-exchange/from/{from}/to/{to}`
   - **Features:**
     - Retrieves currency exchange rates from the database based on the source and target currencies.
     - Implements resilience patterns such as Retry, Circuit Breaker, Rate Limiter, and Bulkhead using Resilience4j.

2. **Currency Conversion Service**
   - **Description:** Handles currency conversion operations.
   - **Endpoints:**
     - `/currency-conversion/from/{from}/to/{to}/quantity/{quantity}`
     - `/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}`
   - **Features:**
     - Utilizes Feign client for communication with the Currency Exchange Service.
     - Performs currency conversion based on the exchange rate retrieved from the Currency Exchange Service.
     - Implements resilience patterns using Resilience4j.

3. **API Gateway**
   - **Description:** Acts as an entry point for all incoming requests and routes them to appropriate microservices.
   - **Endpoints:** Defined routes for currency exchange and conversion operations.
   - **Features:**
     - Utilizes Spring Cloud Gateway for routing requests.
     - Implements request filtering and URI rewriting.

4. **Naming Server (Eureka)**
   - **Description:** Implements service registration and discovery using Eureka.
   - **Features:**
     - Registers all microservices with the Naming Server.
     - Enables other microservices to discover and communicate with each other dynamically.

## Usage
1. Clone the repository: `git clone https://github.com/Manishkumarchoudhary2003/Micro-Services.git`
2. Navigate to the respective microservices directories.
3. Build and run each microservice using Maven or Gradle.
4. Access the microservices endpoints as per the defined routes.
