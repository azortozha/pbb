#version 410 core

out vec4 fragp;
in vec2 iuv;
uniform sampler2D capture;
uniform vec3 color;

void main() {
    //fragp = texture(capture, iuv);
    fragp = vec4(color, 1.0);
}