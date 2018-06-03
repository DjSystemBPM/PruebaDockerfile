ARG IMAGE_BUILDER_NAME
FROM ${IMAGE_BUILDER_NAME} as builder
FROM registry.access.redhat.com/jboss-fuse-6/fis-java-openshift
MAINTAINER "Legosoft Soluciones SA de CV" "acuevas@legosoft.com"
COPY --from=builder /target/*.jar /deployments/multiva-app.jar
USER root
RUN chown jboss:root /deployments/multiva-app.jar
USER 185
