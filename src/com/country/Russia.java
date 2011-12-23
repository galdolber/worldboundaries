package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Russia {

  public static boolean test(Point p) {
    if ((p.getX() >= 131.75277700000004 && p.getY() >= 42.95332299999996 && p.getX() <= 131.923309 && p.getY() <= 43.063323999999966) || (p.getX() >= 146.07608000000002 && p.getY() >= 43.45804600000002 && p.getX() <= 146.22607400000004 && p.getY() <= 43.54583000000014) || (p.getX() >= 146.59606900000003 && p.getY() >= 43.70360599999998 && p.getX() <= 146.90496800000003 && p.getY() <= 43.87499200000001) || (p.getX() >= 47.62304699999999 && p.getY() >= 43.93166400000007 && p.getX() <= 47.78555300000005 && p.getY() <= 43.99109599999997) || (p.getX() >= 145.40747099999996 && p.getY() >= 43.649162000000096 && p.getX() <= 146.56802400000004 && p.getY() <= 44.50999500000007) || (p.getX() >= 146.83218400000007 && p.getY() >= 44.39694200000014 && p.getX() <= 148.85885599999995 && p.getY() <= 45.524437000000034) || (p.getX() >= 47.9322130000001 && p.getY() >= 45.504166 && p.getX() <= 47.99387400000006 && p.getY() <= 45.65304600000008) || (p.getX() >= 48.33443500000004 && p.getY() >= 45.67165399999999 && p.getX() <= 48.47109999999998 && p.getY() <= 45.80443600000001) || (p.getX() >= 48.492759999999976 && p.getY() >= 45.69609100000002 && p.getX() <= 48.73053700000008 && p.getY() <= 45.886657999999954) || (p.getX() >= 149.43746899999996 && p.getY() >= 45.58082600000006 && p.getX() <= 150.49856599999995 && p.getY() <= 46.214157000000114) || (p.getX() >= 150.79852300000005 && p.getY() >= 46.43526500000013 && p.getX() <= 150.87551900000017 && p.getY() <= 46.47110000000004) || (p.getX() >= 150.73080400000003 && p.getY() >= 46.699715000000026 && p.getX() <= 150.769989 && p.getY() <= 46.72971299999995) || (p.getX() >= 151.70440700000017 && p.getY() >= 46.77137800000014 && p.getX() <= 152.29302999999993 && p.getY() <= 47.174713) || (p.getX() >= 152.38803100000018 && p.getY() >= 47.30332200000004 && p.getX() <= 152.54193099999998 && p.getY() <= 47.38249200000013) || (p.getX() >= 152.98111000000003 && p.getY() >= 47.69165800000002 && p.getX() <= 153.09829700000012 && p.getY() <= 47.8144380000001) || (p.getX() >= 153.13775600000005 && p.getY() >= 48.04305300000004 && p.getX() <= 153.290527 && p.getY() <= 48.136383000000016) || (p.getX() >= 153.973022 && p.getY() >= 48.721930999999984 && p.getX() <= 154.23080400000012 && p.getY() <= 48.91360500000002) || (p.getX() >= 153.89831500000014 && p.getY() >= 48.92276800000002 && p.getX() <= 154.01110800000004 && p.getY() <= 48.97971300000006) || (p.getX() >= 154.44024700000014 && p.getY() >= 49.07332600000001 && p.getX() <= 154.60080000000016 && p.getY() <= 49.16915899999998) || (p.getX() >= 154.59390300000007 && p.getY() >= 49.262215000000026 && p.getX() <= 154.90441899999996 && p.getY() <= 49.63638300000008) || (p.getX() >= 154.35495000000003 && p.getY() >= 49.732491000000095 && p.getX() <= 154.46191400000006 && p.getY() <= 49.83387800000003) || (p.getX() >= 155.20858800000008 && p.getY() >= 50.052597000000105 && p.getX() <= 156.15304600000013 && p.getY() <= 50.775826000000045) || (p.getX() >= 156.16360499999996 && p.getY() >= 50.625640999999966 && p.getX() <= 156.49578899999995 && p.getY() <= 50.87082700000008) || (p.getX() >= 155.44769300000007 && p.getY() >= 50.80277300000012 && p.getX() <= 155.669708 && p.getY() <= 50.934158000000025) || (p.getX() >= 141.63803100000018 && p.getY() >= 45.88860299999999 && p.getX() <= 144.75164800000005 && p.getY() <= 54.424713) || (p.getX() >= 137.70831299999998 && p.getY() >= 54.3572160000001 && p.getX() <= 137.93026700000007 && p.getY() <= 54.5077740000001) || (p.getX() >= 137.54858400000015 && p.getY() >= 54.38745100000011 && p.getX() <= 137.6455380000001 && p.getY() <= 54.565269) || (p.getX() >= 19.627257999999983 && p.getY() >= 54.455826 && p.getX() <= 19.89820300000008 && p.getY() <= 54.638554000000056) || (p.getX() >= 167.43136600000003 && p.getY() >= 54.49887799999999 && p.getX() <= 168.11691299999995 && p.getY() <= 54.866386000000034) || (p.getX() >= 136.66726700000004 && p.getY() >= 54.881935 && p.getX() <= 137.18829300000004 && p.getY() <= 55.12165800000014) || (p.getX() >= 137.221313 && p.getY() >= 54.61832400000003 && p.getX() <= 138.2071840000001 && p.getY() <= 55.19721199999998) || (p.getX() >= 19.79700700000012 && p.getY() >= 54.325553999999954 && p.getX() <= 22.86916400000001 && p.getY() <= 55.28860500000008) || (p.getX() >= 165.831909 && p.getY() >= 54.674164000000125 && p.getX() <= 166.66857900000002 && p.getY() <= 55.36277000000007) || (p.getX() >= 150.454559 && p.getY() >= 59.00138900000008 && p.getX() <= 150.747742 && p.getY() <= 59.15554800000013) || (p.getX() >= 148.94101 && p.getY() >= 59.124161000000015 && p.getX() <= 149.122742 && p.getY() <= 59.21360800000008) || (p.getX() >= 163.38552900000002 && p.getY() >= 58.46527100000014 && p.getX() <= 164.70413200000007 && p.getY() <= 59.23721300000005) || (p.getX() >= 155.47830199999996 && p.getY() >= 59.309158000000025 && p.getX() <= 155.578308 && p.getY() <= 59.359160999999965) || (p.getX() >= 28.55110900000011 && p.getY() >= 60.26721200000002 && p.getX() <= 28.716106000000025 && p.getY() <= 60.35193600000008) || (p.getX() >= 35.85082999999997 && p.getY() >= 64.32415800000007 && p.getX() <= 36.04749300000015 && p.getY() <= 64.41609199999999) || (p.getX() >= -172.75808699999996 && p.getY() >= 64.61137399999996 && p.getX() <= -172.488312 && p.getY() <= 64.6749880000001) || (p.getX() >= 39.97470900000008 && p.getY() >= 64.56469700000008 && p.getX() <= 40.47887400000002 && p.getY() <= 64.76554899999991) || (p.getX() >= -172.67599499999997 && p.getY() >= 64.70246900000012 && p.getX() <= -172.167267 && p.getY() <= 64.86137400000013) || (p.getX() >= 40.20388000000008 && p.getY() >= 64.87052900000015 && p.getX() <= 40.288887000000095 && p.getY() <= 64.99247700000012) || (p.getX() >= 35.52109500000012 && p.getY() >= 64.96499600000004 && p.getX() <= 35.86888099999993 && p.getY() <= 65.19274899999994) || (p.getX() >= 35.94332099999997 && p.getY() >= 65.16276600000003 && p.getX() <= 36.30082700000008 && p.getY() <= 65.21165500000001) || (p.getX() >= -169.09915199999998 && p.getY() >= 65.74746700000003 && p.getX() <= -168.989746 && p.getY() <= 65.829163) || (p.getX() >= 69.242752 && p.getY() >= 66.65277100000014 && p.getX() <= 69.35498000000007 && p.getY() <= 66.72331199999996) || (p.getX() >= 69.789154 && p.getY() >= 66.72137499999997 && p.getX() <= 70.04776000000004 && p.getY() <= 66.78360000000004) || (p.getX() >= 42.43249500000002 && p.getY() >= 66.68498200000005 && p.getX() <= 42.72082500000005 && p.getY() <= 66.79109199999999) || (p.getX() >= 69.12664800000005 && p.getY() >= 66.47164900000013 && p.getX() <= 70.10443099999998 && p.getY() <= 66.80720500000001) || (p.getX() >= 54.198044000000095 && p.getY() >= 68.24914600000005 && p.getX() <= 54.33693699999998 && p.getY() <= 68.34137000000004) || (p.getX() >= 53.85916100000002 && p.getY() >= 68.28749099999999 && p.getX() <= 54.01332900000011 && p.getY() <= 68.37442000000004) || (p.getX() >= 50.794716 && p.getY() >= 68.372208 && p.getX() <= 51.456657000000064 && p.getY() <= 68.49748199999999) || (p.getX() >= 57.19999700000011 && p.getY() >= 68.71887200000009 && p.getX() <= 57.92083000000002 && p.getY() <= 68.81164600000011) || (p.getX() >= 67.14887999999996 && p.getY() >= 68.77609300000006 && p.getX() <= 67.38638300000014 && p.getY() <= 68.83137499999998) || (p.getX() >= 55.224563999999994 && p.getY() >= 68.90763900000013 && p.getX() <= 55.50842299999994 && p.getY() <= 68.94183299999997) || (p.getX() >= -179.99999999999997 && p.getY() >= 64.25442499999997 && p.getX() <= -169.69055199999994 && p.getY() <= 68.9801030000001) || (p.getX() >= 54.56777199999999 && p.getY() >= 68.94775400000015 && p.getX() <= 54.69748700000008 && p.getY() <= 69.00555400000007) || (p.getX() >= 65.9519350000001 && p.getY() >= 68.93997200000001 && p.getX() <= 66.53776599999998 && p.getY() <= 69.10415599999999) || (p.getX() >= 58.76055100000008 && p.getY() >= 69.13729900000004 && p.getX() <= 59.24895500000008 && p.getY() <= 69.33970599999998) || (p.getX() >= 33.97304500000001 && p.getY() >= 69.3374940000001 && p.getX() <= 34.40915700000011 && p.getY() <= 69.40415999999993) || (p.getX() >= 66.93803400000013 && p.getY() >= 69.36137400000013 && p.getX() <= 67.21748400000013 && p.getY() <= 69.45637499999998) || (p.getX() >= 48.21221200000008 && p.getY() >= 68.72276299999999 && p.getX() <= 50.331108000000086 && p.getY() <= 69.50999500000006) || (p.getX() >= 161.06219499999997 && p.getY() >= 68.88677999999999 && p.getX() <= 161.52136200000018 && p.getY() <= 69.54582199999999) || (p.getX() >= 67.02110299999998 && p.getY() >= 69.44470200000012 && p.getX() <= 67.366379 && p.getY() <= 69.595261) || (p.getX() >= 161.3724670000001 && p.getY() >= 69.40585300000004 && p.getX() <= 161.63388099999997 && p.getY() <= 69.637497) || (p.getX() >= 169.98495500000013 && p.getY() >= 69.71550000000013 && p.getX() <= 170.2033080000001 && p.getY() <= 69.79081700000006) || (p.getX() >= 167.75192300000003 && p.getY() >= 69.56721500000009 && p.getX() <= 169.45553600000017 && p.getY() <= 70.0205380000001) || (p.getX() >= 82.76860000000009 && p.getY() >= 70.11886600000008 && p.getX() <= 83.11360200000001 && p.getY() <= 70.25166300000008) || (p.getX() >= 58.40860000000004 && p.getY() >= 69.66638200000006 && p.getX() <= 60.547774999999945 && p.getY() <= 70.47886700000004) || (p.getX() >= 83.37969999999996 && p.getY() >= 70.36248800000004 && p.getX() <= 83.62776199999996 && p.getY() <= 70.53360000000004) || (p.getX() >= 56.84165999999999 && p.getY() >= 70.49026500000002 && p.getX() <= 57.224991000000095 && p.getY() <= 70.60192899999998) || (p.getX() >= 162.23663299999996 && p.getY() >= 70.63526900000005 && p.getX() <= 162.48495500000013 && p.getY() <= 70.67915299999993) || (p.getX() >= 161.46328700000004 && p.getY() >= 70.745407 && p.getX() <= 161.69384800000012 && p.getY() <= 70.83749399999999) || (p.getX() >= 83.06666599999994 && p.getY() >= 70.3913730000001 && p.getX() <= 83.46360800000002 && p.getY() <= 70.85359200000005) || (p.getX() >= 160.40637200000003 && p.getY() >= 70.81330899999995 && p.getX() <= 160.719788 && p.getY() <= 70.93193100000008) || (p.getX() >= 53.43249500000013 && p.getY() >= 71.10693400000008 && p.getX() <= 53.619155999999975 && p.getY() <= 71.18386800000007) || (p.getX() >= 53.12915800000008 && p.getY() >= 71.28997800000002 && p.getX() <= 53.360550000000096 && p.getY() <= 71.35859700000015) || (p.getX() >= 52.20832799999994 && p.getY() >= 70.96026600000009 && p.getX() <= 53.21804800000001 && p.getY() <= 71.401093) || (p.getX() >= -175.923615 && p.getY() >= 71.375809 && p.getX() <= -175.61556999999996 && p.getY() <= 71.43193100000013) || (p.getX() >= 178.61773700000003 && p.getY() >= 70.79640199999993 && p.getX() <= 180.0 && p.getY() <= 71.53610200000008) || (p.getX() >= 136.99133300000003 && p.getY() >= 71.411652 && p.getX() <= 137.96460000000002 && p.getY() <= 71.59443700000003) || (p.getX() >= -179.99999999999997 && p.getY() >= 70.9052430000001 && p.getX() <= -177.43945299999993 && p.getY() <= 71.59774800000001) || (p.getX() >= 138.27386500000011 && p.getY() >= 71.8311000000001 && p.getX() <= 138.51608299999998 && p.getY() <= 71.88554399999998) || (p.getX() >= 76.85470600000006 && p.getY() >= 72.2752690000001 && p.getX() <= 78.39305100000001 && p.getY() <= 72.63192700000003) || (p.getX() >= 126.64998600000013 && p.getY() >= 72.06860399999994 && p.getX() <= 129.56109600000002 && p.getY() <= 72.64248700000002) || (p.getX() >= 128.10052500000006 && p.getY() >= 72.52360500000003 && p.getX() <= 128.97219800000005 && p.getY() <= 72.672211) || (p.getX() >= 72.84054600000003 && p.getY() >= 72.60165400000011 && p.getX() <= 73.00277700000004 && p.getY() <= 72.68858299999998) || (p.getX() >= 127.31414800000003 && p.getY() >= 72.65026899999992 && p.getX() <= 129.35580400000015 && p.getY() <= 72.78776599999996) || (p.getX() >= 128.290527 && p.getY() >= 72.78166199999998 && p.getX() <= 129.29803500000014 && p.getY() <= 72.9002690000001) || (p.getX() >= 122.30246699999998 && p.getY() >= 72.761932 && p.getX() <= 123.60582 && p.getY() <= 72.9452510000001) || (p.getX() >= 78.57859800000011 && p.getY() >= 72.69970700000003 && p.getX() <= 79.58248899999995 && p.getY() <= 73.09693900000013) || (p.getX() >= 74.08970600000009 && p.getY() >= 72.8558200000001 && p.getX() <= 74.96249399999994 && p.getY() <= 73.13192700000013) || (p.getX() >= 119.62970000000008 && p.getY() >= 73.02970900000014 && p.getX() <= 120.27832 && p.getY() <= 73.16638200000004) || (p.getX() >= 76.12275700000004 && p.getY() >= 73.12915000000004 && p.getX() <= 76.73748799999994 && p.getY() <= 73.216385) || (p.getX() >= 71.13998400000014 && p.getY() >= 73.28193700000008 && p.getX() <= 71.35914600000012 && p.getY() <= 73.41415400000005) || (p.getX() >= 51.39499699999999 && p.getY() >= 70.53942900000004 && p.getX() <= 57.63999200000012 && p.getY() <= 73.422211) || (p.getX() >= 69.86637900000005 && p.getY() >= 73.01527400000003 && p.getX() <= 71.6791530000001 && p.getY() <= 73.5166630000001) || (p.getX() >= 126.30220000000008 && p.getY() >= 72.4005429999999 && p.getX() <= 129.118835 && p.getY() <= 73.53776600000003) || (p.getX() >= 127.38804600000003 && p.getY() >= 73.48304699999994 && p.getX() <= 128.0624690000001 && p.getY() <= 73.53997800000006) || (p.getX() >= 76.07415800000007 && p.getY() >= 73.42387400000013 && p.getX() <= 76.766098 && p.getY() <= 73.55664099999996) || (p.getX() >= 75.30632000000008 && p.getY() >= 73.40404500000011 && p.getX() <= 76.07777400000009 && p.getY() <= 73.56887799999993) || (p.getX() >= 80.05664100000013 && p.getY() >= 73.50000000000004 && p.getX() <= 80.40359500000005 && p.getY() <= 73.57026700000011) || (p.getX() >= 86.39498900000001 && p.getY() >= 73.58804300000008 && p.getX() <= 86.90220599999996 && p.getY() <= 73.701096) || (p.getX() >= 122.42804 && p.getY() >= 72.30053700000002 && p.getX() <= 126.71499600000003 && p.getY() <= 73.803589) || (p.getX() >= 139.65277100000003 && p.getY() >= 73.20332300000001 && p.getX() <= 143.53164700000013 && p.getY() <= 73.91998299999993) || (p.getX() >= 124.28777300000014 && p.getY() >= 73.83770800000002 && p.getX() <= 124.66081200000009 && p.getY() <= 73.94802900000006) || (p.getX() >= 86.22276300000003 && p.getY() >= 73.90554800000001 && p.getX() <= 86.49693300000001 && p.getY() <= 73.98248300000012) || (p.getX() >= 83.87942500000001 && p.getY() >= 73.95332300000001 && p.getX() <= 84.41914400000006 && p.getY() <= 74.04359400000003) || (p.getX() >= 82.81581099999994 && p.getY() >= 74.03776600000009 && p.getX() <= 83.61970500000001 && p.getY() <= 74.14971899999993) || (p.getX() >= 82.31469700000008 && p.getY() >= 74.04859900000008 && p.getX() <= 82.73637400000001 && p.getY() <= 74.1593170000001) || (p.getX() >= 85.40887500000001 && p.getY() >= 74.12747200000007 && p.getX() <= 85.73278800000008 && p.getY() <= 74.19247400000013) || (p.getX() >= 135.35357699999997 && p.getY() >= 73.87414600000011 && p.getX() <= 136.27249100000017 && p.getY() <= 74.25694300000009) || (p.getX() >= 140.07275400000015 && p.getY() >= 73.90161100000006 && p.getX() <= 141.11718800000003 && p.getY() <= 74.28221099999996) || (p.getX() >= 115.88388099999997 && p.getY() >= 74.28498800000004 && p.getX() <= 116.12719700000001 && p.getY() <= 74.37469499999997) || (p.getX() >= 58.93498999999997 && p.getY() >= 74.33554100000003 && p.getX() <= 59.081108000000086 && p.getY() <= 74.40914900000001) || (p.getX() >= 84.37303199999997 && p.getY() >= 74.39526400000011 && p.getX() <= 84.94525099999998 && p.getY() <= 74.50637799999998) || (p.getX() >= 111.45471200000003 && p.getY() >= 74.09193400000004 && p.getX() <= 113.43331900000008 && p.getY() <= 74.54887400000001) || (p.getX() >= 85.65942400000006 && p.getY() >= 74.43969700000012 && p.getX() <= 86.21276900000004 && p.getY() <= 74.57360799999998) || (p.getX() >= 85.14498900000007 && p.getY() >= 74.45109600000006 && p.getX() <= 85.65332000000006 && p.getY() <= 74.5813750000001) || (p.getX() >= 79.14915500000012 && p.getY() >= 74.51805100000001 && p.getX() <= 79.61219800000016 && p.getY() <= 74.65664700000002) || (p.getX() >= 85.09553500000003 && p.getY() >= 74.71499600000011 && p.getX() <= 85.703598 && p.getY() <= 74.81224099999997) || (p.getX() >= 86.21110500000003 && p.getY() >= 74.82638500000002 && p.getX() <= 87.13749700000005 && p.getY() <= 74.98814400000003) || (p.getX() >= 82.02720599999996 && p.getY() >= 75.09414700000002 && p.getX() <= 82.1519320000001 && p.getY() <= 75.15832500000003) || (p.getX() >= 81.49304200000006 && p.getY() >= 75.17109700000003 && p.getX() <= 82.29193100000009 && p.getY() <= 75.51748700000002) || (p.getX() >= 146.07025099999996 && p.getY() >= 74.75665300000014 && p.getX() <= 150.953033 && p.getY() <= 75.59165999999999) || (p.getX() >= 140.51944000000003 && p.getY() >= 75.64860500000003 && p.getX() <= 140.76998900000012 && p.getY() <= 75.71415700000011) || (p.getX() >= 135.4441220000001 && p.getY() >= 75.36248799999994 && p.getX() <= 136.17913800000008 && p.getY() <= 75.84999100000003) || (p.getX() >= 58.99360700000011 && p.getY() >= 75.88247699999994 && p.getX() <= 59.278327999999995 && p.getY() <= 75.9252620000001) || (p.getX() >= 81.55081199999995 && p.getY() >= 75.85887100000008 && p.getX() <= 82.25694300000009 && p.getY() <= 75.93525699999998) || (p.getX() >= 58.69471000000009 && p.getY() >= 75.8955380000001 && p.getX() <= 59.26693700000004 && p.getY() <= 75.98637400000013) || (p.getX() >= 82.25721700000001 && p.getY() >= 75.90942400000006 && p.getX() <= 83.30247500000006 && p.getY() <= 75.99525500000003) || (p.getX() >= 96.69442700000002 && p.getY() >= 75.9747010000001 && p.getX() <= 97.33728000000009 && p.getY() <= 76.10208100000004) || (p.getX() >= 140.84719800000005 && p.getY() >= 76.05949399999997 && p.getX() <= 141.07940700000006 && p.getY() <= 76.14414999999991) || (p.getX() >= 59.866104000000064 && p.getY() >= 76.10165400000011 && p.getX() <= 60.49832900000007 && p.getY() <= 76.18942300000003) || (p.getX() >= 152.45523100000003 && p.getY() >= 76.105255 && p.getX() <= 152.80304 && p.getY() <= 76.21192900000005) || (p.getX() >= 136.859955 && p.getY() >= 74.64694199999997 && p.getX() <= 145.39471400000014 && p.getY() <= 76.22026100000005) || (p.getX() >= 95.00277699999992 && p.getY() >= 76.15220599999996 && p.getX() <= 95.19941699999998 && p.getY() <= 76.22079499999995) || (p.getX() >= 94.4080350000001 && p.getY() >= 76.17942800000014 && p.getX() <= 94.99748200000003 && p.getY() <= 76.28776600000003) || (p.getX() >= 95.26361099999998 && p.getY() >= 76.097488 && p.getX() <= 96.64942900000013 && p.getY() <= 76.30415299999999) || (p.getX() >= 96.38304100000009 && p.getY() >= 76.29248000000013 && p.getX() <= 96.76832600000004 && p.getY() <= 76.34027100000003) || (p.getX() >= 96.7111050000001 && p.getY() >= 76.17359899999991 && p.getX() <= 97.07304399999998 && p.getY() <= 76.3494260000001) || (p.getX() >= 113.11875900000007 && p.getY() >= 76.35832200000003 && p.getX() <= 113.44442700000002 && p.getY() <= 76.43637100000007) || (p.getX() >= 93.86998000000013 && p.getY() >= 76.56999200000007 && p.getX() <= 94.357208 && p.getY() <= 76.60981800000013) || (p.getX() >= 111.95665000000001 && p.getY() >= 76.44192500000008 && p.getX() <= 112.713882 && p.getY() <= 76.65664700000002) || (p.getX() >= 95.88916000000006 && p.getY() >= 76.60720800000001 && p.getX() <= 96.47248799999994 && p.getY() <= 76.70600900000005) || (p.getX() >= 94.81303399999999 && p.getY() >= 76.629974 && p.getX() <= 95.32693500000005 && p.getY() <= 76.71235699999998) || (p.getX() >= 95.41276600000003 && p.getY() >= 76.64526399999998 && p.getX() <= 95.83194000000015 && p.getY() <= 76.71388200000008) || (p.getX() >= 97.31637599999992 && p.getY() >= 76.58082600000012 && p.getX() <= 97.59414700000013 && p.getY() <= 76.71748400000001) || (p.getX() >= 148.39221199999997 && p.getY() >= 76.63420100000003 && p.getX() <= 149.31442300000012 && p.getY() <= 76.76832600000012) || (p.getX() >= 97.72943100000003 && p.getY() >= 76.766098 && p.getX() <= 97.92776500000012 && p.getY() <= 76.84443700000003) || (p.getX() >= 53.62999000000008 && p.getY() >= 73.24275200000011 && p.getX() <= 68.93136600000008 && p.getY() <= 77.01304599999997) || (p.getX() >= 89.82971199999997 && p.getY() >= 77.10914600000001 && p.getX() <= 90.18026700000014 && p.getY() <= 77.14360000000005) || (p.getX() >= 156.43414300000015 && p.getY() >= 77.10304300000007 && p.getX() <= 156.73217799999998 && p.getY() <= 77.14804100000016) || (p.getX() >= 88.62719700000001 && p.getY() >= 77.00499000000013 && p.getX() <= 88.95721400000012 && p.getY() <= 77.15026899999992) || (p.getX() >= 95.229156 && p.getY() >= 76.94525099999998 && p.getX() <= 96.58442700000006 && p.getY() <= 77.20637500000004) || (p.getX() >= 105.780548 && p.getY() >= 77.25221299999998 && p.getX() <= 106.00776700000013 && p.getY() <= 77.29803500000001) || (p.getX() >= 89.13581800000003 && p.getY() >= 77.16442900000003 && p.getX() <= 89.6874850000001 && p.getY() <= 77.31442300000009) || (p.getX() >= 106.33167300000012 && p.getY() >= 77.30304000000007 && p.getX() <= 106.458328 && p.getY() <= 77.32415799999995) || (p.getX() >= 107.20027199999998 && p.getY() >= 77.2288670000001 && p.getX() <= 107.68969700000008 && p.getY() <= 77.35664400000006) || (p.getX() >= 106.50417299999998 && p.getY() >= 77.37330600000007 && p.getX() <= 106.90415999999992 && p.getY() <= 77.47053500000003) || (p.getX() >= 82.12025499999999 && p.getY() >= 77.4583280000001 && p.getX() <= 82.580826 && p.getY() <= 77.521927) || (p.getX() >= 91.73970000000003 && p.getY() >= 77.59971600000006 && p.getX() <= 92.039154 && p.getY() <= 77.66720600000002) || (p.getX() >= 27.346942999999957 && p.getY() >= 41.19609100000002 && p.getX() <= 180.0 && p.getY() <= 77.73220800000001) || (p.getX() >= 106.49304200000005 && p.getY() >= 78.04942299999999 && p.getX() <= 107.699707 && p.getY() <= 78.19053600000007) || (p.getX() >= 93.51971400000009 && p.getY() >= 78.15138200000001 && p.getX() <= 93.75054900000003 && p.getY() <= 78.2230380000001) || (p.getX() >= 105.992752 && p.getY() >= 78.18997200000013 && p.getX() <= 106.76138300000001 && p.getY() <= 78.34082000000012) || (p.getX() >= 92.18261700000004 && p.getY() >= 79.07054100000003 && p.getX() <= 92.72554000000008 && p.getY() <= 79.13192700000003) || (p.getX() >= 99.34137000000003 && p.getY() >= 77.93969700000012 && p.getX() <= 105.415817 && p.getY() <= 79.42970300000003) || (p.getX() >= 92.58221400000002 && p.getY() >= 79.37776200000013 && p.getX() <= 92.98776200000003 && p.getY() <= 79.43942300000009) || (p.getX() >= 91.8041530000001 && p.getY() >= 79.379974 && p.getX() <= 92.46748400000008 && p.getY() <= 79.4494170000001) || (p.getX() >= 99.85054000000001 && p.getY() >= 79.39776600000003 && p.getX() <= 100.01776100000006 && p.getY() <= 79.4563750000001) || (p.getX() >= 90.78193699999997 && p.getY() >= 79.45416300000005 && p.getX() <= 91.468597 && p.getY() <= 79.54914900000011) || (p.getX() >= 76.04193100000009 && p.getY() >= 79.48109400000003 && p.getX() <= 77.61970500000012 && p.getY() <= 79.65721100000006) || (p.getX() >= 99.90359500000004 && p.getY() >= 79.5788730000001 && p.getX() <= 100.306641 && p.getY() <= 79.70138500000002) || (p.getX() >= 91.12441999999999 && p.getY() >= 79.64942900000011 && p.getX() <= 91.8588710000001 && p.getY() <= 79.73332199999999) || (p.getX() >= 58.2791600000001 && p.getY() >= 79.87081900000003 && p.getX() <= 58.988045 && p.getY() <= 79.97859200000005) || (p.getX() >= 93.927475 && p.getY() >= 79.96304299999997 && p.getX() <= 94.3255460000001 && p.getY() <= 80.03610200000014) || (p.getX() >= 49.19360399999999 && p.getY() >= 79.98719799999996 && p.getX() <= 49.43526500000007 && p.getY() <= 80.041656) || (p.getX() >= 90.86442600000004 && p.getY() >= 79.65860000000004 && p.getX() <= 93.80886800000007 && p.getY() <= 80.06553600000012) || (p.getX() >= 49.33027599999997 && p.getY() >= 80.01527400000009 && p.getX() <= 49.68305200000009 && p.getY() <= 80.09275800000006) || (p.getX() >= 50.04388400000005 && p.getY() >= 79.91526799999998 && p.getX() <= 51.5019380000001 && p.getY() <= 80.09971600000006) || (p.getX() >= 58.75916299999994 && p.getY() >= 79.91442900000003 && p.getX() <= 59.860550000000046 && p.getY() <= 80.11499000000016) || (p.getX() >= 92.850815 && p.getY() >= 78.776093 && p.getX() <= 100.07610300000003 && p.getY() <= 80.16998299999993) || (p.getX() >= 59.89777400000015 && p.getY() >= 80.16165200000006 && p.getX() <= 60.28943600000014 && p.getY() <= 80.20443699999998) || (p.getX() >= 49.532211000000125 && p.getY() >= 80.05415299999994 && p.getX() <= 50.333603000000096 && p.getY() <= 80.23553500000001) || (p.getX() >= 54.145271000000086 && p.getY() >= 80.20416300000005 && p.getX() <= 54.445824000000016 && p.getY() <= 80.33027600000001) || (p.getX() >= 54.85749800000008 && p.getY() >= 80.218323 && p.getX() <= 55.54388399999999 && p.getY() <= 80.34443700000003) || (p.getX() >= 52.166664000000026 && p.getY() >= 80.32054099999993 && p.getX() <= 52.52137800000008 && p.getY() <= 80.36415099999994) || (p.getX() >= 55.713608000000015 && p.getY() >= 80.06442300000009 && p.getX() <= 57.13971700000002 && p.getY() <= 80.36665300000003) || (p.getX() >= 52.18138100000005 && p.getY() >= 80.167755 && p.getX() <= 53.871658000000025 && p.getY() <= 80.411652) || (p.getX() >= 55.78611000000012 && p.getY() >= 80.37109399999997 && p.getX() <= 56.32777399999992 && p.getY() <= 80.43525699999998) || (p.getX() >= 54.977486000000056 && p.getY() >= 80.36943100000002 && p.getX() <= 55.36693600000001 && p.getY() <= 80.45138500000002) || (p.getX() >= 54.370270000000005 && p.getY() >= 80.39360000000009 && p.getX() <= 54.863052000000096 && p.getY() <= 80.49054000000001) || (p.getX() >= 56.94638099999997 && p.getY() >= 80.09359700000003 && p.getX() <= 59.276382000000126 && p.getY() <= 80.49304200000006) || (p.getX() >= 54.64110599999998 && p.getY() >= 80.466385 && p.getX() <= 55.16332200000005 && p.getY() <= 80.56191999999999) || (p.getX() >= 53.77999099999994 && p.getY() >= 80.41831999999998 && p.getX() <= 54.46499600000004 && p.getY() <= 80.6085970000001) || (p.getX() >= 57.21305100000001 && p.getY() >= 80.54748500000005 && p.getX() <= 58.03499600000004 && p.getY() <= 80.6438750000001) || (p.getX() >= 58.537773000000016 && p.getY() >= 80.58276399999994 && p.getX() <= 58.85527000000002 && p.getY() <= 80.64694200000001) || (p.getX() >= 53.105270000000125 && p.getY() >= 80.48165900000009 && p.getX() <= 53.54583000000014 && p.getY() <= 80.6569369999999) || (p.getX() >= 55.43249500000008 && p.getY() >= 80.623871 && p.getX() <= 56.94860099999993 && p.getY() <= 80.77859500000005) || (p.getX() >= 44.857498000000135 && p.getY() >= 80.4369200000001 && p.getX() <= 48.76638800000006 && p.getY() <= 80.85554500000013) || (p.getX() >= 59.22082499999999 && p.getY() >= 80.40165700000011 && p.getX() <= 62.28527100000014 && p.getY() <= 80.88720700000003) || (p.getX() >= 53.97554800000012 && p.getY() >= 80.71943700000003 && p.getX() <= 55.98276500000002 && p.getY() <= 80.89360000000005) || (p.getX() >= 57.81638300000003 && p.getY() >= 80.74552900000009 && p.getX() <= 59.025269000000094 && p.getY() <= 80.89637800000001) || (p.getX() >= 46.61638600000009 && p.getY() >= 80.06748999999996 && p.getX() <= 51.746940999999936 && p.getY() <= 80.92637600000013) || (p.getX() >= 78.9727630000001 && p.getY() >= 80.80581699999999 && p.getX() <= 80.43775900000009 && p.getY() <= 80.97943100000003) || (p.getX() >= 57.83416000000011 && p.getY() >= 80.94609100000012 && p.getX() <= 58.69887500000009 && p.getY() <= 81.10720800000001) || (p.getX() >= 58.51527400000009 && p.getY() >= 81.06999200000001 && p.getX() <= 58.808044 && p.getY() <= 81.11276199999996) || (p.getX() >= 56.09638200000006 && p.getY() >= 80.84582500000003 && p.getX() <= 58.27860300000003 && p.getY() <= 81.11831700000003) || (p.getX() >= 54.41832700000003 && p.getY() >= 80.69192500000008 && p.getX() <= 57.7208250000001 && p.getY() <= 81.12359600000002) || (p.getX() >= 60.02499400000005 && p.getY() >= 80.91526799999998 && p.getX() <= 61.656097000000095 && p.getY() <= 81.12414600000005) || (p.getX() >= 58.14943700000009 && p.getY() >= 81.11248800000003 && p.getX() <= 58.64860500000003 && p.getY() <= 81.15277100000009) || (p.getX() >= 50.347488 && p.getY() >= 81.0088810000001 && p.getX() <= 50.98333000000014 && p.getY() <= 81.16693100000003) || (p.getX() >= 62.504166 && p.getY() >= 80.68165600000009 && p.getX() <= 65.47026100000005 && p.getY() <= 81.19720500000005) || (p.getX() >= 59.01082600000001 && p.getY() >= 81.16970800000013 && p.getX() <= 59.844711000000125 && p.getY() <= 81.22053500000003) || (p.getX() >= 89.89359999999998 && p.getY() >= 81.05554200000012 && p.getX() <= 91.578323 && p.getY() <= 81.22720300000003) || (p.getX() >= 56.99471300000005 && p.getY() >= 81.12359600000002 && p.getX() <= 58.080551000000014 && p.getY() <= 81.23803700000006) || (p.getX() >= 91.42025800000003 && p.getY() >= 79.99414100000001 && p.getX() <= 97.96943699999997 && p.getY() <= 81.29054300000001) || (p.getX() >= 59.72221400000007 && p.getY() >= 81.24414100000007 && p.getX() <= 60.63888500000013 && p.getY() <= 81.30525200000005) || (p.getX() >= 54.11471600000005 && p.getY() >= 81.26609799999994 && p.getX() <= 54.42193600000007 && p.getY() <= 81.35331700000006) || (p.getX() >= 55.43166400000007 && p.getY() >= 81.16276600000003 && p.getX() <= 57.90277100000009 && p.getY() <= 81.38777199999998) || (p.getX() >= 58.46193699999998 && p.getY() >= 81.284714 && p.getX() <= 59.381660000000124 && p.getY() <= 81.40470900000001) || (p.getX() >= 56.7413790000001 && p.getY() >= 81.36637900000005 && p.getX() <= 58.57249500000007 && p.getY() <= 81.56164600000005) || (p.getX() >= 61.65443399999998 && p.getY() >= 81.54220600000006 && p.getX() <= 62.20360600000004 && p.getY() <= 81.60832200000003) || (p.getX() >= 58.226654 && p.getY() >= 81.55693100000002 && p.getX() <= 58.71971100000008 && p.getY() <= 81.6144260000001) || (p.getX() >= 62.10416400000008 && p.getY() >= 81.58248900000012 && p.getX() <= 63.802773 && p.getY() <= 81.72082500000009) || (p.getX() >= 57.88888500000013 && p.getY() >= 81.68775899999997 && p.getX() <= 59.43776700000012 && p.getY() <= 81.85192900000003)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Russia.data"));
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      Geometry geo = Util.convert(data);
      for (int i = 0; i < geo.getNumGeometries(); i++) {
        if (geo.getGeometryN(i).contains(p)) {
          return true;
        }
      }
    }
    return false;
  }
}