## Deployment Kubernetes

Cette section explique comment lancer l'application et la base MySQL sur un cluster Kubernetes local.

### Prérequis

- Kubernetes activé (Docker Desktop ou Minikube)
- kubectl installé et configuré
- Docker avec l'image de l'API buildée localement

### Lancer les ressources

Depuis la racine du projet :

```bash
kubectl apply -f k8s/

Vérifier les Pods : 

kubectl get pods

Vérifier les Services :

kubectl get services

Accéder à l'API

L’API est exposée via NodePort 30080 sur ta machine locale :
http://localhost:30080
