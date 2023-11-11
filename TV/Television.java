package TV;

public class Television {

    private int currentChannel;
    private int maxChannels;
    private Channel[] channels;

    public Television(int channel) {
        this(channel, 3);
    }

    public Television(int channel, int maxChannels) {
        currentChannel = channel;
        this.maxChannels = maxChannels;
        channels = new Channel[maxChannels];
        fillChannels();
    }

    private void fillChannels() {
        String[] channelNames = { "OPT", "PTP", "KTP", "MIR", "MTV", "TNT", "HTC", "TB3", "CTC", "HBT" };
        for (int i = 0; i < maxChannels; i++) {
            channels[i] = new Channel(channelNames[i]);
        }
    }

    public void nextChannel() {
        currentChannel = (currentChannel + 1) > maxChannels ? 1 : currentChannel + 1;
    }

    public void prevChannel() {
        currentChannel = currentChannel - 1 == 0 ? maxChannels : currentChannel - 1;
    }

    public void toChannel(int channel) {
        currentChannel = channel;
    }

    public String printChannel() {
        return String.format("<<<<<<<<<< %s >>>>>>>>>>%n%s%n", currentChannel, getChannelName(currentChannel));
    }

    private String getChannelName(int channelNumber) {
        return channels[channelNumber - 1].getName();
    }
}
