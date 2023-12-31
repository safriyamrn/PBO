PGDMP                         {            isco    15.2    15.2                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                        1262    49969    isco    DATABASE     {   CREATE DATABASE isco WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_Indonesia.1252';
    DROP DATABASE isco;
                postgres    false            �            1259    49975    book    TABLE       CREATE TABLE public.book (
    isbn character varying NOT NULL,
    judul character varying,
    idkategori character varying,
    pengarang character varying,
    penerbit character varying,
    tahun character varying,
    halamanbuku character varying
);
    DROP TABLE public.book;
       public         heap    postgres    false            �            1259    49989    kategori    TABLE     p   CREATE TABLE public.kategori (
    idkategori character varying NOT NULL,
    namakategori character varying
);
    DROP TABLE public.kategori;
       public         heap    postgres    false            �            1259    49970    login    TABLE     �   CREATE TABLE public.login (
    idlogin character varying(100) NOT NULL,
    nama character varying(100),
    username character varying(100),
    password character varying(100)
);
    DROP TABLE public.login;
       public         heap    postgres    false            �            1259    49996 
   peminjaman    TABLE       CREATE TABLE public.peminjaman (
    idpinjam character varying NOT NULL,
    namapeminjam character varying,
    prodi character varying,
    semester character varying,
    angkatan character varying,
    tglpinjam date,
    tglkembali date,
    isbn character varying
);
    DROP TABLE public.peminjaman;
       public         heap    postgres    false            �            1259    66346    peminjamanskripsi    TABLE       CREATE TABLE public.peminjamanskripsi (
    idpinjam character varying NOT NULL,
    nama character varying,
    prodi character varying,
    semester character varying,
    angkatan character varying,
    idskripsi character varying,
    tglpinjam date,
    tglkembali date
);
 %   DROP TABLE public.peminjamanskripsi;
       public         heap    postgres    false            �            1259    49982    skripsi    TABLE     �   CREATE TABLE public.skripsi (
    idskripsi character varying NOT NULL,
    judulskripsi character varying,
    penulis character varying,
    tahunskripsi character varying,
    halamanskripsi character varying
);
    DROP TABLE public.skripsi;
       public         heap    postgres    false                      0    49975    book 
   TABLE DATA           `   COPY public.book (isbn, judul, idkategori, pengarang, penerbit, tahun, halamanbuku) FROM stdin;
    public          postgres    false    215   o                 0    49989    kategori 
   TABLE DATA           <   COPY public.kategori (idkategori, namakategori) FROM stdin;
    public          postgres    false    217   �-                 0    49970    login 
   TABLE DATA           B   COPY public.login (idlogin, nama, username, password) FROM stdin;
    public          postgres    false    214   _.                 0    49996 
   peminjaman 
   TABLE DATA           t   COPY public.peminjaman (idpinjam, namapeminjam, prodi, semester, angkatan, tglpinjam, tglkembali, isbn) FROM stdin;
    public          postgres    false    218   �.                 0    66346    peminjamanskripsi 
   TABLE DATA           x   COPY public.peminjamanskripsi (idpinjam, nama, prodi, semester, angkatan, idskripsi, tglpinjam, tglkembali) FROM stdin;
    public          postgres    false    219   �5                 0    49982    skripsi 
   TABLE DATA           a   COPY public.skripsi (idskripsi, judulskripsi, penulis, tahunskripsi, halamanskripsi) FROM stdin;
    public          postgres    false    216   �:       {           2606    49981    book book_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.book
    ADD CONSTRAINT book_pkey PRIMARY KEY (isbn);
 8   ALTER TABLE ONLY public.book DROP CONSTRAINT book_pkey;
       public            postgres    false    215                       2606    49995    kategori kategori_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.kategori
    ADD CONSTRAINT kategori_pkey PRIMARY KEY (idkategori);
 @   ALTER TABLE ONLY public.kategori DROP CONSTRAINT kategori_pkey;
       public            postgres    false    217            y           2606    49974    login login_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.login
    ADD CONSTRAINT login_pkey PRIMARY KEY (idlogin);
 :   ALTER TABLE ONLY public.login DROP CONSTRAINT login_pkey;
       public            postgres    false    214            �           2606    50002    peminjaman peminjaman_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.peminjaman
    ADD CONSTRAINT peminjaman_pkey PRIMARY KEY (idpinjam);
 D   ALTER TABLE ONLY public.peminjaman DROP CONSTRAINT peminjaman_pkey;
       public            postgres    false    218            �           2606    66352 (   peminjamanskripsi peminjamanskripsi_pkey 
   CONSTRAINT     l   ALTER TABLE ONLY public.peminjamanskripsi
    ADD CONSTRAINT peminjamanskripsi_pkey PRIMARY KEY (idpinjam);
 R   ALTER TABLE ONLY public.peminjamanskripsi DROP CONSTRAINT peminjamanskripsi_pkey;
       public            postgres    false    219            }           2606    49988    skripsi skripsi_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.skripsi
    ADD CONSTRAINT skripsi_pkey PRIMARY KEY (idskripsi);
 >   ALTER TABLE ONLY public.skripsi DROP CONSTRAINT skripsi_pkey;
       public            postgres    false    216            �           2606    66353     peminjamanskripsi idskripsi_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.peminjamanskripsi
    ADD CONSTRAINT idskripsi_fkey FOREIGN KEY (idskripsi) REFERENCES public.skripsi(idskripsi) NOT VALID;
 J   ALTER TABLE ONLY public.peminjamanskripsi DROP CONSTRAINT idskripsi_fkey;
       public          postgres    false    219    216    3197            �           2606    50008    peminjaman isbn_fkey    FK CONSTRAINT     {   ALTER TABLE ONLY public.peminjaman
    ADD CONSTRAINT isbn_fkey FOREIGN KEY (isbn) REFERENCES public.book(isbn) NOT VALID;
 >   ALTER TABLE ONLY public.peminjaman DROP CONSTRAINT isbn_fkey;
       public          postgres    false    215    3195    218            �           2606    58154    book kategori_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.book
    ADD CONSTRAINT kategori_fkey FOREIGN KEY (idkategori) REFERENCES public.kategori(idkategori) NOT VALID;
 <   ALTER TABLE ONLY public.book DROP CONSTRAINT kategori_fkey;
       public          postgres    false    3199    215    217                  x��Z�r�:�]�_���L����w��e���|oݞ�$�J�{����?6'�")��홞U�.@f�s�$�0�G�\�B�=O��&;&�w�w������Mʞ�k�՜�D,yu�(��Y/
;�h�	�A�7ĿXL�t��5���gXc��ܳ�Zd|�"Za|F�^8���PZ�'���Lh��o\KZK���UҰ2I$�WJm�\c�T�����x��G��`8���$��k�iʓ��J�`���F��-R��AEg!�������Fa��&*e3k���M����Ş��o猧1�6���
�1��qv�ӌ�L�؝ͬذL�&�����q���(�m��#��:���L`��4U<S�\����ﵲ{���_m�6��^��a�I��v�τ?׍\ˌ'�U|��fR��4�O(Ï�����N&��?�U�P�^��;a/��i�:c�2@d�3���]��I�N�m���)�����UG�F�Ag؛�4�؁����?6�=��x����l�wB������O�O�czU�|O<�k��H{B��e7u�B�c`��B�d��د2]����r��dg�Z���du��Q',Kv%ҟ|'Sv�o��4eӝ�\p�o]�~��qjB���Nn�
���{Vk��~���"bC�j�F"��5�ֿ�^�9�g�|"]o���!ܝd��z�ݓMWJ+@�d�S.է*�\�s~�^��Ԇ-��j���4����ل�B#[�=�E,ٍM��֥�_���ͭ^�&��`�=� ��t�b���`.~]�� 	G8��{�j�B� ���>c��Ab�����4n� l!w�`��
�}}�����\i)ޑf���5���ʸe��N{U�v�]_�Q��.�L����!ߡ<G����6
b���n�Btب��@$��l�r£N�6�
�����7��F-�rʭVT������'��	;8h[J��Ɨ�A���(@܈S��aI�;s=�U��_2�����l������r)����4N�^wx6���T��V�������5�G��Uk�|w�(�r�n.ؽ2H� �R��Y�A�(��[���ʐBR�QI�6Xӗp���=Y�D~�M������	���F}!fMA��T;�J�H��k"&	����,�R
[�$��L 8��Lf��kՂ�D�C@���{|W�p\ ݙ�#h�F��'��L|�e����p';V�Y�N�
��p� �)���3�e�wA�nGeY*�y���!n*��qޅE�w�;e�Ts�>��9{����ϕȲv	���%$�c����xM�IL�!�,���#����[}��m��K���QIި>F����V��%$cﶘ�4L�c#�0;��\KFM-���=z�>��h�)5��MlS�����D���.JJ�Hɡ�����}"v���?<��n��W�2j��:�{����LDQ�W�W��3ظ���]^��v��\��8������
,e�|iJ�|O���9ĕ)W�¢~?az2�%�7J�t	p����rBP�f��%��Npǽᝦ���|P�Z��Z�a^�0*k5��J��3����U]`N���d�7����r�&w.>�}W`.��j�K/�;ԭ�[��!���w���1g��;����vOˋγQ�h�&�D���lyp�v��I�˭w��Z����N�:�䠭@?��ԧ�[O����K�88r��d�	�9�k�Bf��d� �;���õ��H�s�U4�]}�d�#�z�n/ث5P���7�C�lz�H�t�^)��e�>L����7�׳L�'��0���0�N��KEwv�!!�;�a�{D�a����d_/���s�������E���!������c��v��Uʝ�6���/�wX��pad��4��'��j�T7�bP�J�>� �A�&��$[�+��~Z=�;�+�=�{I��e��8������F�S���p� J�-n�]'h-8���XH[���A�v�k�z��+? %q�v���K�"���SY|ʞȑ%~�2 H���9���1�j�$�Z��z>GU6Q���G��c_��ׅИ�����������qSO*|���}f��ӥ�S��7��y`�y�A�AX�5&�v��'��a��)kn�o��E�H���Z�-��F�7�����g���`�������:���S��T�.Q��kj�����A����4���?�7f�Bўu���p�.���W�Nq�덆n�������>X��@�� iu����:ҭ�K��"+�Q�-?g���1��'O$��9���jy���\�����̕Hw#�Y]r����$ ���j������˯m�����q�x�Z��$���P����W���a�	)��R2%K�a4���zB~�����I�zB��`	�qg��z
䫢��K�!��pZ��z��4��Km�?*([0��@>�*�vg��G��3��͎�h��I@.on�����7 �ݕ4]O�v��`��+�+��3>�#0��
Ħ�33N�^՘�1�����'�h�'�񓮭�f�:�=��mi%�@ �f��a/���$ц}zm�V	M
�J�{�˭~-a�X�!���!Ȝ佨{VMm48V�></ȱ��l/��/����TSD�����`w��^�ʏ�!m�U�&��c����]1*P�G�f���zW�D�Iw�@T��`��1(��sx�&�6W [��d�8���09�?�d���ˢTsE{N�Df[�+���t�z��S�{{t���8c1�Ѹ^�*
"S�m�=C=�dL&��g�@��������e�|��~�F���,Q�*}@h�i^��e9�[͖���aI
��%�"��q�\A��3�U��N]�y+�NN���=�bҼV^��5n�#^��I�LDfw�R�i#4�Z#u��:������Hl�o
��'���h���K~�7U�5��o4v��'<��`.���c6I06�^���)��=m[��W�.����~����Xa�V�Ӣ5�uiZ^��N���C"�QF}���N�뷙���-u��Ҿ�l[��mQڲ�_��]4FY�y����|�kr���,R6)���3ih�+��1����*��3�v�o8( �%��ʟ*��7�`�
�_���2�.V1�yS\��.�Œ�iz��������\��e9����a�Jo}3��N'܃�M%��p�ͽ8�� �8]k�R� �ޕBw�FG	��w�2�
�;��i��vQ����7��eo�2��0>E�y$�"�(�Q�aC���:#=`�uo��P��%���e/�<W�`�&T��t��F�����v%�܃�o���*Eǐ��k�/лXi�s!=q8^ʳ]A�d���pm�F���S��]�7�����hK��Ԁ-�'��Q�X�n���Q��V���� ||�����kL'Z]��:6��^fAf�ǏW��D%�3��|�E�{�����������{I�{?Z�eZ����{�j��J&t���پ��=� ����CU$�Omx�]'��2M��6�a<s�_ -�H��˓��H�2���ea�G%������)�I�&sz�ڏ�o=x��ׯ��{x�'������<qc|���W�\���uʙY�(-��\s#�Ӈ�>6z���wu��GTL-t_��4M$��+��sR�:Q�Lr��]7�Ǖ*���e}���'s8p/&�(�D�ǰ�[u��W����q-�������6Q��e.ODM�������mS@�pn�fRs���E_c#r��JY�_�����t�iBSy7u�7t��TM`��X�ST�ح���Cͻ2{֙�$U'5nD4Ӡ�t��U"k���@K�NL�_+���-�zEQCe�yV��<�=kcO���Q���r&Ϯ^��]Z�$�W&^��f7o��,��jTǷ���|m��`�}��fD1�s?�j��&D���5v���#��K'��Ub.*�=��4k�^17�wb7ܻ͞,ϊ��c�p�j�S3��W��l�� 9   z��ҕ	Fmʻ�ڭ�M��������W��Z�jc�����=���^����s�         �   x�5�;�0��)|����(AI�fE6f�x٦��,�yӸ=\8������&��%�42�p��s�`+%�?�w|�Xȶ�IX��g�x{Ţ��A���ʶ��,q��m-SLACvT�İ�%�*�%kB_}%0���g5         +   x�3�404032204�,NL+ʬLцf&��F�&\1z\\\ ��         7  x���oo�6�_��B_���$�L�v��vE3l�7l�&Z�����;J�N�IJ��-�����=wb>��؛��)�vww�kv�n�C�X����o]�0���%7��t�@	��W�1��/�⋻t����<�� 2���Rmd	�GT���)������!� �(��x��U%��r#�rHR�/���C۸���4�f:ˤ��I��&a#�����w�K�ٵu�(!LqĘf�P�1��O.�!Kv��~߸�{j�ː҇S9fYm@1��YN��}Ȋ}8޸����Z��H̓U�i�i�-�������~����qş�v{v3K��"<b�ַ�'ju��z=�wkU$����J:{x,��z�t�+>�u�C��0���OG��gB����<���}��愤H�*�]ń���R�ۻ:YM9)I��U|iԐ�\IP�?��*)��I=Gɫ y�Z^ֳbo��z[�wm��WtԼ
��粢�}l�����q�%��䕔���Op�֥�����HIՠ$�K������:���1��Y���Q������ȼA����t&Oч����c˹�}:
5 g-��_��y�&�U@��A�����G�z$=Ɛ0K�$��ĺ�n|��uԦ�I��D�'���#<?O�m܍�M��@�hħ���*S9��G�u`��*�?�m����q�n�Н�q�2B��ɏ�ev41��^��H����i��=F|�;i�g\��%<R�7���gw�]��C�:�3�P���T�]�_ޅm&kp�(ׁr1���վE�Ѽ����a.�С��5�.z�rYΗ�:VϓE�t�Lp.+v�{���nF�d�1�9̥�/�'k���\��Ɲ/�Q�,-�'k����ji����.F�ccR-�� ��zdH���C���@�LI�4�?�8��(?jq��٣O���y U�7�y{&�E�<���Z��y�&�E�<��ʮ�vA���x��5_�� �kX��0���v-~���.�Qo�j��C���"��֫�z��tLy�6?��@X¸cǼ]���KXF�]Wk�JPF�]���D%*��n�zo��Qo7��ہ���e:�k���<@��뽝�<@�v�V{;'$y@2��F��vN����Ș���i��0z��n����i����(���Z�������9A��Qo/�zo�9�G����vN�� z��K�����<�e���f݃+>��9fqr��v:
uQ�^��b���W��ˈ�l�lW���w���-{�?�Cvl��wZ��T������CM���7/��'f�����&��c�T���g��{ۼx=-�I��vĖJ��-�;.�t�{Ԕ*D~P���ė*��JN�ʿ��AI�����ClrU~�zh��w5*)?7��#�ly��������%�9������)��J��w��K��s�]$�^�0����#4��4ڇ#V4�xî��{���}vv�@�����{I��͔�Ǒ��L71�;v�Q��H��T�f�ʲ����&;��G
��c�wۿ��3�y��wL�n��E�����;�x��x��g�F�Y|�$V�p�i����~\i�n���9ޭ�����9�n������V�����{2��.?{=HoMx���m�&�<�C�"I�~ztq��o��	/!7�m�M�O�����䄻����b9�)�u����-�p�!��xx/���pէ(�$�����wWM�F����`��A|r�X��a��F��ק�]��_��a�9���_ٳ���w�P������N�/K}O��0�x>�|�F�e��z�������         �  x����n�6�����B�'/ݺi��a��7L��B��B�i��/W���b`���3"��#�������m���y���K����x�����_��/c�:�K�=����6:
q���{LuT�t��n��c�*elR��-�\��퇇�.etw�z��b�5m�����U�Y*����*&	��Z�u[���f�*�Q�<�f)b����C�^Ȝ�tn���[&�F���0<T�t\�8N��弭�yQ$5i%yhS�����/��~zy��P�ذŖŒJ��ĥN��籱�b�c�����Xf��Z��>��xiY�Y������H�|����8�k<Ŗ�!kC�7d��s��C|�Ze�y�g�o4�KRݻ1���_Te:l�hDA���<���?��07b!�a^��~<��n�Fĕ<	۽�99�O�*���'���?�c<<�����I+�	��v��w�)���+i�%M�9���0{�e-�I�8�?���c�����Z�M1سV�l(M��4�)�*��)=����`�Fjx�:#l�Y23�peFj�`)Wm��&�ll�TYKi�%MҢK�&�`���J�$N���q�8����I�K�����<)�`��t'Q�`�U��ה&����ӗ8�%N
'X�7Q�a/�28�J�f�a���Q�ywR0����Ӥp�U>Cp�T���	Vt�e��<i�`E�ʓ*y�0��N'U�a�5I+g=����R���	֒��<i�`�X�	�<i�`�Y�_O:�i�`M��sEi�8�:�9N��I�k��'���)��$K�L��S�(7���:EP�dI��	6�J�N���y28�FemΓ�K�L���\��d`�M�n�N'�X�n.O'��7�ry�8�&�k�'lB���'li����۲%mv'�l����dq�-\ɓ�	��V��	��V��	��N��	��V��	��f��	�t�lO&�іTٝN�kt"N�kt"N�k�"L�k�"L�k�"N�#�+qr8������;��M�<L�,�����"ݤ��{�Vv'��K/bsy�8��ы�0��nr�Þ�	�t6���7	��\ٝ<N�'�s�ԛ�)�{"��� ��J�Lp(]�Mg/���Mk/��ҋ��My
8��ы0��ы0��ы�78��8��@��m�D����=�&8�M��'�q=J�mڲ�)�㻻��� �1�         �	  x��Z�v�8}F�?�sH���-v��X�d�ϼ@"$"$AH&���}I�cw�>�E�­��,<�=J#�Z��l)6l����������de��XE"S|��T,��4+|��L����r�Qb0`#�*�\�X�_���Qy"8���Q���]��@�"�K��2��z����]�e�م-8d��.���9u�,#���V�8-~�&�=l�N�$Sd"x�ٟ����ؖ���4�1~z�h�Q�[#6��yQ�2V95�壢��٨��F#�9b�܈\��)��jW��1�_���E̞d	�UAw1�R�}�]|/(�騏��t�ux�2�f>�&(b�3iG@�)�l�j˯E.x.M�v���X&Ҭ%{�&��+�F���wvh�^��Z�<����d���E�U��ۦ3�q��.�X8�X�f�>�Ŋ�)<a���ύ�H��u�d����բ��0�q��L�!�W�B��ʑ��������ɞ��#}XG�d+-�F�C�נ��&2a�V5x7�/��{a��x�a��|WԻ}�Bb|�f
%��=�4 `�@7k���E��"b��I�Y
�;�����*��%�4����1�
��J� ��x�����BWӴ"�,0ѥ�y��U����e�i��@�8 ��R@�� �(+&=ڼ*W��:N�,c�I��s�i��'��u{��(�	�G�2�u� ����׬g���
�����b�*��o��V�L�N�J�N�~M����FLZʈ}Do!��V�ԩ�>��k������o�t��P��x����<��[�_� �� 0?�ͱ�jsH/�F��t]/N��:J;3F8�Q�3~����eI�������b?��-���_�n�!P�ɉ[��r�"NF]��윹�"A7B�X��{a���"�q�oc�����@4�+kKx\)"��^��A�E�$���J��&���΋-!#�$�ؼl���a�����f�|�ߍ�XX���J%��B�� ��j���&��Y�I}�G����d��ύ�pr�FP��^�i���$�� H!��^���Ȧ����G1�YA��"�ڨW�t���q�reQ\dj�n�@G�>�T[���/�i{�������VG]��ZU�MD.:L^�:�!�R���;�!��У��ANH�5U���x��Y���3����=\�u}�ĢHn,��q�H>��֢��Gh�k��H�{���lxJ%.o0M���D����;6�0�$2��;Y_t?K��+�9�v�ܫ$|�����|�Q^2m�ו�T��h��1�϶��;���!7���Ap�W�D;�E��JáG�����R]GN@P�b����hkm)q��Qл�r���"n�����?˓��`�O�G?��@�ጅ�
y�`����n���" *i"`L���'Yݵ�R%�V���Ɩ�FUDWuL-���r���	Ւ�$S��w���M;���9�w����Jt�
�Zz�N�,�~S��pl��! k�]�G�)�bUب5-�4�8VX�it5]�M��i=̜�����vJ������A^?�[5��z:���}˜�G�ϝ��f1��tAQ{�Nˣ�����D�>��xn�K�=����qt��DFoH ��[h�.�wHs�����w�r����Q��ڻ�R���ZN��P϶��(A	~�&A��6�l�|Ea�*Q��E�L�Mzۭ`��LV��Y\�:�@�X�@�yBS�X����d�/+^�'��	�$�����R�{&�|�σ��ԽX����c�|���&2��1g�.�d{~�`")��LvK�<��x�E�(��˥�+��s��ս���^إd��a�[.�?���$jv�yr�:x��U욼���.WQ�vW��CP� ���&�I�PDY��QD���/�,#�E��69W�>:9s�y̘M�L�C>��"+�̸�:�a�S�Lhz�ԡNϙ:��3��=��R�|a�.�C$��K�؞�%uHu�	�ʪ��[��>���y0Ɲ��@z���|�^��HF.��mu�iqW����שl���>m*��t-W���;�����ψ�e�-�t�Qr֯���cEm"u�Z�be��X�(����o46Gf�ˑZ<�b��n��d��,Y^/�։Z��+o�!�7fHs���}��4��1M���B�U�y2{E�<ȕ�܄>���i'Rfo��h�z��8��ꉓ٬R�<�d��J�K��k ��-Mj��J�+���g�1��mn ���9��/o�����(�Q�!�{o�*���q��ސٙ-��|����:!u�W'�����`�ƕ;rP�/7���{#ְ��&�$=|Y���_ы�6��� �����g�-*e�ײu�L�e�ڼ�M�3k�����e��Uח��j�������>�R�3c     