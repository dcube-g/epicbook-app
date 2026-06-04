# EpicBook Platform – End-to-End DevOps Automation on Azure

## Project Overview

EpicBook Platform is a DevOps automation project that demonstrates Infrastructure as Code (IaC), Configuration Management, Continuous Integration, and Continuous Deployment using Microsoft Azure and open-source DevOps tools.

The project provisions Azure infrastructure using Terraform, configures servers using Ansible, builds a Spring Boot application using Maven, and deploys the application to an Azure Virtual Machine behind an Nginx reverse proxy.

The deployment process is fully automated through Azure DevOps Pipelines.

---

## Architecture Diagram

```text
+----------------------+
|  Azure DevOps Repos  |
+----------+-----------+
           |
           v
+----------------------+
| Azure DevOps Pipeline|
+----------+-----------+
           |
           v
+----------------------+
|      Ansible         |
| Configuration Mgmt   |
+----------+-----------+
           |
           v
+----------------------+
| Azure Virtual Machine|
| Ubuntu 22.04         |
| Java 21              |
| Nginx                |
+----------+-----------+
           |
           v
+----------------------+
| Spring Boot App      |
| EpicBook Platform    |
+----------+-----------+
           |
           v
+----------------------+
| Public Endpoint      |
| HTTP Port 80         |
+----------------------+
```

---

## Technologies Used

### Cloud

* Microsoft Azure
* Azure Virtual Machine

### Infrastructure as Code

* Terraform

### Configuration Management

* Ansible

### CI/CD

* Azure DevOps Pipelines

### Application Stack

* Java 21
* Spring Boot 3.3
* Maven

### Web Server

* Nginx

### Source Control

* Git
* Azure Repos

### Operating System

* Ubuntu 22.04 LTS

---

## Terraform Workflow

### Infrastructure Provisioning

Terraform is used to provision Azure infrastructure.

Resources include:

* Resource Group
* Virtual Network
* Subnet
* Network Security Group
* Public IP
* Azure Linux Virtual Machine

### Deployment Flow

```text
Terraform Init
      |
      v
Terraform Plan
      |
      v
Terraform Apply
      |
      v
Azure VM Created
```

### Benefits

* Infrastructure as Code
* Repeatable deployments
* Version controlled infrastructure
* Environment consistency

---

## Ansible Workflow

Ansible automates server configuration and application deployment.

### Tasks Performed

* Install Java Runtime
* Configure Nginx
* Copy Spring Boot JAR
* Configure systemd service
* Start application service
* Restart Nginx

### Workflow

```text
Azure DevOps
      |
      v
Ansible Playbook
      |
      +--> Install Packages
      |
      +--> Configure Nginx
      |
      +--> Deploy JAR
      |
      +--> Configure Service
      |
      +--> Start Application
```

---

## Azure DevOps Pipeline Workflow

### Build Stage

* Checkout source code
* Install Maven
* Build application
* Generate executable JAR

### Deployment Stage

* Download SSH Key
* Configure SSH
* Execute Ansible Playbook
* Deploy application to Azure VM

### Pipeline Flow

```text
Code Commit
     |
     v
Azure DevOps Pipeline
     |
     +--> Build Application
     |
     +--> Package JAR
     |
     +--> Deploy via Ansible
     |
     +--> Azure VM Updated
```

---

## Application Deployment

Application artifact:

```text
target/epicbook-1.0.0.jar
```

Deployment location:

```text
/opt/epicbook/epicbook.jar
```

Application execution:

```bash
java -jar /opt/epicbook/epicbook.jar
```

---

## Nginx Reverse Proxy

Nginx forwards external traffic to the Spring Boot application.

```text
Internet
    |
    v
Nginx :80
    |
    v
Spring Boot :8080
```

---

## Public Endpoint Verification

Application successfully deployed and verified.

### Internal Verification

```bash
curl http://localhost
```

Output:

```text
EpicBook Application Running
```

### External Verification

```bash
curl http://20.198.77.144
```

Output:

```text
EpicBook Application Running
```

---

## Deployment Validation

### Nginx Status

```bash
sudo systemctl status nginx
```

Result:

```text
Active: active (running)
```

### Application Port

```bash
sudo ss -tulpn | grep 8080
```

Result:

```text
Java application listening on port 8080
```

### Reverse Proxy

```bash
curl http://localhost
```

Result:

```text
EpicBook Application Running
```

---

## Screenshots

Add screenshots here after deployment:

### Azure DevOps Pipeline Success

Insert screenshot:

```text
images/pipeline-success.png
```

### Azure VM Deployment

Insert screenshot:

```text
images/vm-deployment.png
```

### Application Running

Insert screenshot:

```text
images/application-running.png
```

### Nginx Validation

Insert screenshot:

```text
images/nginx-validation.png
```

---

## Key Achievements

* Provisioned Azure infrastructure using Terraform
* Automated configuration using Ansible
* Built Spring Boot application using Maven
* Configured Nginx reverse proxy
* Implemented Azure DevOps CI/CD pipeline
* Deployed application on Azure Linux VM
* Validated public endpoint accessibility

---

## Author

DevOps Engineer Project Portfolio

EpicBook Platform demonstrates practical experience with Azure, Terraform, Ansible, CI/CD pipelines, Linux administration, and Spring Boot application deployment.
