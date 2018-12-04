from setuptools import setup
import os
def read(fname):
    return open(os.path.join(os.path.dirname(__file__), fname)).read()

if __name__ == '__main__':
    setup(
        name = 'Scrawll',
        version="0.01",
        description = 'A Python based wallpaper collecting tool',
        author = 'Jimut Bahan Pal',
        author_email = 'paljimutbahan@gmail.com',
        maintainer = 'Jimut Bahan Pal',
        maintainer_email = 'paljimutbahan@gmail.com',
        url = '',
        license = 'GPLv2+',
        platforms = 'Linux',
        py_modules = ['Scrawll'],
        entry_points = {
            'console_scripts': ['Scrawll = Scrawll:main'],
        },
        include_package_data = True,
        install_requires = [
            'beautifulsoup4',
            'urllib3',
            'pip',
            'wget'
        ],
        keywords = 'Wallpaper collector, bypassing the robots.txt',
        classifiers = [
                'Development Status :: 4 - Production/Stable',
                'Environment :: Console',
                'Intended Audience :: End Users/Desktop',
                'Intended Audience :: System Administrators',
                'License :: OSI Approved :: GNU General Public License v2 or later (GPLv2+)',
                'Operating System :: Ubuntu',
                'Programming Language :: Python :: 3.5',
                'Topic :: Internet :: WWW/HTTP',
                'Topic :: Internet :: WWW/HTTP :: Indexing/Search'
                ],
    )

