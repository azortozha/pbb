package core.types;

import org.lwjgl.opengl.GL33;

public class FrameBuffer {
    
    public int framebufferObject, renderbufferObject;

    public static FrameBuffer createFramebuffer() {
        FrameBuffer fb = new FrameBuffer();

        fb.framebufferObject = GL33.glGenFramebuffers();
        GL33.glBindFramebuffer(GL33.GL_FRAMEBUFFER, fb.framebufferObject);

        fb.renderbufferObject = GL33.glGenRenderbuffers();

        return fb;
    }
}
