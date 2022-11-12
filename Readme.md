Steps to compile and deploy the application
1. Install Minikube
2. Open the terminal and come to this project path
3. mvn clean install
4. minikube image build -t config-demo .
5. minikube image ls
6. Go to helm folder
7. Run helm upgrade --install spring-boot-config-map-demo .
8. minikube dashboard
9. helm uninstall spring-boot-config-map-demo -n ns-local