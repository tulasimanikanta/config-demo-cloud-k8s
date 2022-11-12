{{- define "sample-template.labels" }}
labels:
    app: configmap-demo-example
    generator: helm
    date: {{ now | htmlDate }}
{{- end }}